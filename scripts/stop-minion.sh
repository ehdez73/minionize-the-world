#!/bin/bash
echo -e "\e[34mstopping containers\e[39m"
docker stop minion-front
docker stop minion-ipsum
docker stop minion-characters
