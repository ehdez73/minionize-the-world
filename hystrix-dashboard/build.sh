#/bin/bash
mvn package
docker stop hystrix-dashboard
docker rm hystrix-dashboard
docker build --force-rm=true --tag=ehdez73/hystrix-dashboard .
docker run -d -p 7979:7979 --name="hystrix-dashboard" --hostname="hystrix-dashboard" ehdez73/hystrix-dashboard
