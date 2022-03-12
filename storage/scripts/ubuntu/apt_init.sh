#!/usr/bin/env bash

set -o errexit -o nounset

TOP_DIR=$(cd $(cat "../TOP_DIR" 2>/dev/null||echo $(dirname "$0"))/.. && pwd)

source "$TOP_DIR/config/paths"
source "$CONFIG_DIR/openstack"
source "$CONFIG_DIR/localrc"
source "$LIB_DIR/functions.guest.sh"

indicate_current_auto

exec_logfile

function set_apt_proxy {
    local PRX_KEY="Acquire::http::Proxy"
    local APT_FILE=/etc/apt/apt.conf

    if [ -f $APT_FILE ] && grep -q $PRX_KEY $APT_FILE; then
        # apt proxy has already been set (by preseed/kickstart)
        if [ -n "${VM_PROXY-}" ]; then
            # Replace with requested proxy
            sudo sed -i "s#^\($PRX_KEY\).*#\1 \"$VM_PROXY\";#" $APT_FILE
        else
            # No proxy requested -- remove
            sudo sed -i "s#^$PRX_KEY.*##" $APT_FILE
        fi
    elif [ -n "${VM_PROXY-}" ]; then
        # Proxy requested, but none configured: add line
        echo "$PRX_KEY \"$VM_PROXY\";" | sudo tee -a $APT_FILE
    fi
}

set_apt_proxy

# Use repository redirection for faster repository access.
# The mirror 'archive.ubuntu.com' points to the closest to your location
# instead of the 'us.archive.ubuntu.com' ones in United States
sudo sed  -i 's/us.archive.ubuntu.com/archive.ubuntu.com/g' /etc/apt/sources.list

# Get apt index files
sudo apt update

# ---------------------------------------------------------------------------
# Enable the OpenStack repository
# https://docs.openstack.org/install-guide/environment-packages-ubuntu.html
# - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
# NOTE: Using pre-release staging ppa is not documented in install-guide
# https://launchpad.net/~ubuntu-cloud-archive/+archive/ubuntu/train-staging
#--------------------------------------------------------------------------

echo "Installing packages needed for add-apt-repository."
sudo apt -y install software-properties-common

case "$OPENSTACK_RELEASE" in
    wallaby)
        REPO=cloud-archive:wallaby
        SRC_FILE=cloudarchive-wallaby.list
        ;;
    xena)
        REPO=cloud-archive:xena
        SRC_FILE=cloudarchive-xena.list
        ;;
    *)
        echo >&2 "Unknown OpenStack release: $OPENSTACK_RELEASE. Aborting."
        exit 1
        ;;
esac

echo "Adding cloud repo: $REPO"
sudo add-apt-repository "$REPO"

# Get index files only for ubuntu-cloud repo but keep standard lists
if [ -f "/etc/apt/sources.list.d/$SRC_FILE" ]; then
    sudo apt update \
        -o Dir::Etc::sourcelist="sources.list.d/$SRC_FILE" \
        -o Dir::Etc::sourceparts="-" -o APT::Get::List-Cleanup="0"
else
    echo "ERROR: apt source not found: /etc/apt/sources.list.d/$SRC_FILE"
    exit 1
fi

# Disable automatic updates (they compete with our scripts for the dpkg lock)
sudo systemctl disable apt-daily.service
sudo systemctl disable apt-daily.timer

# Add mariadb repo
cat << EOF | sudo tee /etc/apt/sources.list.d/mariadb.list
# Repo Created by Ram N Sangwan
deb [arch=amd64,arm64,ppc64el] https://mirrors.bkns.vn/mariadb/repo/10.6/ubuntu focal main
EOF

# Import key required for mariadb
sudo apt-key adv --fetch-keys 'https://mariadb.org/mariadb_release_signing_key.asc'
# sudo apt-key adv --keyserver keyserver.ubuntu.com --recv-keys F1656F24C74CD1D8

# Update apt database for mariadb repo
sudo apt update \
    -o Dir::Etc::sourcelist="sources.list.d/mariadb.list" \
    -o Dir::Etc::sourceparts="-" -o APT::Get::List-Cleanup="0"

sudo apt install python3-wcwidth python3-cmd2 xml-core ieee-data libpaper-utils
sudo apt install  python-babel-localedata python3-appdirs python3-babel python3-bs4 python3-os-service-types python3-netaddr python3-roman python3-crypto python3-decorator python3-mako python3-html5lib python3-monotonic
sudo apt install python3-oslo.utils python3-docutils python3-oslo.serialization python3-oslo.context python3-deprecation python3-cliff python3-docutils python3-wrapt python3-keystoneauth1 libjbig0 libjpeg8 python3-dogpile.cache python3-oslo.log

# Pre-configure database root password in /var/cache/debconf/passwords.dat
# (the upstream mariadb-server has socket_auth disabled)
source "$CONFIG_DIR/credentials"
echo "mysql-server mysql-server/root_password password $DATABASE_PASSWORD" | sudo debconf-set-selections
echo "mysql-server mysql-server/root_password_again password $DATABASE_PASSWORD" | sudo debconf-set-selections
