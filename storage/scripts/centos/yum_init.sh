#!/usr/bin/env bash
set -o errexit -o nounset
TOP_DIR=$(cd $(cat "../TOP_DIR" 2>/dev/null||echo $(dirname "$0"))/.. && pwd)
source "$TOP_DIR/config/paths"
source "$CONFIG_DIR/openstack"
# Pick up VM_PROXY
source "$CONFIG_DIR/localrc"
source "$LIB_DIR/functions.guest.sh"

indicate_current_auto

exec_logfile

function set_yum_proxy {
    local YUM_FILE=/etc/yum.conf
    if [ -z "${VM_PROXY-}" ]; then
        return 0;
    fi
    echo "proxy=${VM_PROXY}" | sudo tee -a $YUM_FILE
}

set_yum_proxy

# Enable RDO repo
case "${OPENSTACK_RELEASE:-}" in
    xena)
        sudo dnf install -y "https://repos.fedorapeople.org/repos/openstack/openstack-xena/rdo-release-xena-2.el8.noarch.rpm"
        sudo dnf config-manager --set-enabled powertools
        ;;
    wallaby)
        sudo dnf install -y "https://repos.fedorapeople.org/repos/openstack/openstack-wallaby/rdo-release-wallaby-2.el8.noarch.rpm"
        sudo dnf config-manager --set-enabled powertools
        ;;
    *)
        echo 2>&1 "ERROR Unknown OpenStack release."
        exit 1
esac

