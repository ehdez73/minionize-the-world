#!/bin/bash
echo -e "\e[34mstopping containers\e[39m"
source stop-minion.sh
docker stop config-server
docker stop eureka-server
