#!/usr/bin/env bash

set -o errexit -o nounset

TOP_DIR=$(cd $(cat "../TOP_DIR" 2>/dev/null||echo $(dirname "$0"))/.. && pwd)

source "$TOP_DIR/config/paths"
source "$CONFIG_DIR/credentials"
source "$LIB_DIR/functions.guest.sh"
source "$CONFIG_DIR/admin-openrc.sh"

exec_logfile

indicate_current_auto

#------------------------------------------------------------------------------
# Install and configure a compute node
#------------------------------------------------------------------------------

echo "Installing nova for compute node."
sudo yum install -y openstack-nova-compute*  policycoreutils checkpolicy openstack-selinux python3-openstackclient

echo "Configuring nova for compute node."

placement_admin_user=placement

conf=/etc/nova/nova.conf
echo "Configuring $conf."

echo "Configuring RabbitMQ message queue access."
iniset_sudo $conf DEFAULT transport_url "rabbit://openstack:$RABBIT_PASS@controller"

# Configuring [api] section.
iniset_sudo $conf api auth_strategy keystone

nova_admin_user=nova

MY_MGMT_IP=$(get_node_ip_in_network "$(hostname)" "mgmt")

# Configure [keystone_authtoken] section.
iniset_sudo $conf keystone_authtoken www_authenticate_uri http://controller:5000/
iniset_sudo $conf keystone_authtoken auth_url http://controller:5000/
iniset_sudo $conf keystone_authtoken memcached_servers controller:11211
iniset_sudo $conf keystone_authtoken auth_type password
iniset_sudo $conf keystone_authtoken project_domain_name Default
iniset_sudo $conf keystone_authtoken user_domain_name Default
iniset_sudo $conf keystone_authtoken project_name "$SERVICE_PROJECT_NAME"
iniset_sudo $conf keystone_authtoken username "$nova_admin_user"
iniset_sudo $conf keystone_authtoken password "$NOVA_PASS"

# Configure [DEFAULT] section.
iniset_sudo $conf DEFAULT my_ip "$MY_MGMT_IP"
iniset_sudo $conf DEFAULT use_neutron true
iniset_sudo $conf DEFAULT firewall_driver nova.virt.firewall.NoopFirewallDriver

# Configure [vnc] section.
iniset_sudo $conf vnc enabled true
iniset_sudo $conf vnc server_listen 0.0.0.0
iniset_sudo $conf vnc server_proxyclient_address '$my_ip'
iniset_sudo $conf vnc novncproxy_base_url http://"$(hostname_to_ip controller)":6080/vnc_auto.html

# Configure [glance] section.
iniset_sudo $conf glance api_servers http://controller:9292

# Configure [oslo_concurrency] section.
iniset_sudo $conf oslo_concurrency lock_path /var/lib/nova/tmp

# Configure [placement]
echo "Configuring Placement services."
iniset_sudo $conf placement region_name RegionOne
iniset_sudo $conf placement project_domain_name Default
iniset_sudo $conf placement project_name "$SERVICE_PROJECT_NAME"
iniset_sudo $conf placement auth_type password
iniset_sudo $conf placement user_domain_name Default
iniset_sudo $conf placement auth_url http://controller:5000/v3
iniset_sudo $conf placement username "$placement_admin_user"
iniset_sudo $conf placement password "$PLACEMENT_PASS"

# - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
# Finalize installation
# - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

conf=/etc/nova/nova.conf
echo -n "Hardware acceleration for virtualization: "
if sudo egrep -q '(vmx|svm)' /proc/cpuinfo; then
    echo "available."
    iniset_sudo $conf libvirt virt_type kvm
else
    echo "not available."
    iniset_sudo $conf libvirt virt_type qemu
fi
echo "Config: $(sudo grep virt_type $conf)"

echo "Restarting nova services."
sudo systemctl restart libvirtd 
sudo systemctl enable libvirtd 
sudo systemctl restart openstack-nova-compute 
sudo systemctl enable openstack-nova-compute 

sudo semanage port -a -t http_port_t -p tcp 8778

sudo touch novaapi.te

cat <<EOF | sudo tee -a novaapi.te
module novaapi 1.0;

require {
        type rpm_exec_t;
        type hostname_exec_t;
        type nova_t;
        type gpg_exec_t;
        class file getattr;
}

#============= nova_t ==============
allow nova_t gpg_exec_t:file getattr;
allow nova_t hostname_exec_t:file getattr;
allow nova_t rpm_exec_t:file getattr;
EOF

sudo checkmodule -m -M -o novaapi.mod novaapi.te
sudo semodule_package --outfile novaapi.pp --module novaapi.mod
sudo semodule -i novaapi.pp

sudo firewall-cmd --add-port={6080/tcp,6081/tcp,6082/tcp,8774/tcp,8775/tcp,8778/tcp} --permanent
sudo firewall-cmd --add-port=5900-5999/tcp --permanent
sudo firewall-cmd --reload


# - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
# Add the compute node to the cell database
# - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

echo
echo "Confirming that the compute host is in the database."
AUTH="source $CONFIG_DIR/admin-openrc.sh"
node_ssh controller "$AUTH; openstack compute service list --service nova-compute"
until node_ssh controller "$AUTH; openstack compute service list --service nova-compute | grep 'compute.*up'" >/dev/null 2>&1; do
    sleep 2
    echo -n .
done
node_ssh controller "$AUTH; openstack compute service list --service nova-compute"

echo
echo "Discovering compute hosts."
echo "Run this command on controller every time compute hosts are added to" \
     "the cluster."
node_ssh controller "sudo nova-manage cell_v2 discover_hosts --verbose"

#------------------------------------------------------------------------------
# Verify operation
#------------------------------------------------------------------------------

echo "Verifying operation of the Compute service."

echo "openstack compute service list"
openstack compute service list

echo "List API endpoints to verify connectivity with the Identity service."
echo "openstack catalog list"
openstack catalog list

echo "Listing images to verify connectivity with the Image service."
echo "openstack image list"
openstack image list

echo "Checking the cells and placement API are working successfully."
echo "on controller node: nova-status upgrade check"
node_ssh controller "sudo nova-status upgrade check"
