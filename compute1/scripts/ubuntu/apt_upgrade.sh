#!/usr/bin/env bash

set -o errexit -o nounset

TOP_DIR=$(cd $(cat "../TOP_DIR" 2>/dev/null||echo $(dirname "$0"))/.. && pwd)

source "$TOP_DIR/config/paths"
source "$CONFIG_DIR/openstack"
source "$LIB_DIR/functions.guest.sh"

indicate_current_auto

exec_logfile

#------------------------------------------------------------------------------
# Finalize the installation
#------------------------------------------------------------------------------

sudo DEBIAN_FRONTEND=noninteractive apt \
    -o Dpkg::Options::="--force-confdef" -o Dpkg::Options::="--force-confold" \
    -y upgrade
sudo apt -y dist-upgrade

# Clean apt cache
sudo apt -y autoremove
sudo apt -y clean

# - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
# Install OpenStack client (install-guide)
# - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

echo "Installing OpenStack client."
sudo apt install -y python3-openstackclient

# Starting with bionic, the Ubuntu LTS switched to a new set of network
sudo apt install -y ifupdown

echo "Installing curl, tree (they are small and useful)."
sudo apt install -y curl tree
