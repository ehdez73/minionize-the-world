#!/bin/bash
echo -e "\e[34mstopping containers\e[39m"
docker stop minion-ipsum
docker stop minion-characters
docker stop hystrix-dashboard
docker stop eureka

echo -e "\e[34mremoving containers\e[39m"
docker rm minion-ipsum
docker rm minion-characters
docker rm hystrix-dashboard
docker rm eureka

echo -e "\e[34mremoving images\e[39m"
docker rmi ehdez73/hystrix
docker rmi ehdez73/eureka
docker rmi ehdez73/minion-ipsum
docker rmi ehdez73/minion-characters

echo -e `pwd`
echo -e "\e[34mcreating eureka\e[39m"
cd eureka
source build.sh

echo -e "\e[34mcreating hystrix\e[39m"
cd ../hystrix-dashboard
source build.sh

echo -e "\e[34mcreating minion-characters\e[39m"
cd ../minion-characters
source build.sh

echo -e "\e[34mcreating minion-ipsum\e[39m"
cd ../minion-ipsum
source build.sh


echo -e "\e[34mcreating minion-front\e[39m"
cd ../minion-front
source build.sh
