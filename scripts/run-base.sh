#!/bin/bash
echo -e "\e[34mstarting base containers\e[39m"
docker start eureka-server
docker start config-server
