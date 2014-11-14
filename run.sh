#!/bin/bash
echo -e "\e[34mstopping containers\e[39m"
docker stop minion-front
docker stop minion-ipsum
docker stop minion-characters
docker stop hystrix-dashboard
docker stop eureka


echo -e "\e[34mstarting containers\e[39m"
docker start eureka
docker start minion-ipsum
docker start minion-characters
docker start hystrix-dashboard
docker start minion-front
