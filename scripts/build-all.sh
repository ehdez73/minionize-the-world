#!/bin/bash

echo -e "\e[34mCreating config-server\e[39m"
cd ../config-server
source build.sh

echo -e "\e[34mCreating eureka-server\e[39m"
cd ../eureka-server
source build.sh

echo -e "\e[34mCreating minion-characters\e[39m"
cd ../minion-characters
source build.sh

echo -e "\e[34mCreating minion-ipsum\e[39m"
cd ../minion-ipsum
source build.sh

echo -e "\e[34mCreating hystrix\e[39m"
cd ../hystrix-dashboard
source build.sh

echo -e "\e[34mCreating minion-front\e[39m"
cd ../minion-front
source build.sh
