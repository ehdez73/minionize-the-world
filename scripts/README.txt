Add this entries to your /etc/hosts

172.17.42.1     Sirius docker0
172.17.42.1     sirius-minion-front
172.17.42.1     sirius-minion-ipsum
172.17.42.1     sirius-minion-ipsum-2
172.17.42.1     sirius-minion-characters
172.17.42.1     sirius-minion-characters-2
172.17.42.1     sirius-eureka-server
172.17.42.1     sirius-config-server
172.17.42.1     sirius-hystrix-dashboard


Modify /etc/default/docker.io 
DOCKER_OPTS="--dns 172.17.42.1 --dns 8.8.8.8"


Install and run dnsmasq 