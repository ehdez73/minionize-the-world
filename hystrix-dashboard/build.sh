#/bin/bash
mvn package
docker build -t ehdez73/hystrix-dashboard .
docker run -d -p 7979:7979 --name="hystrix-dashboard" --hostname="hystrix-dashboard" ehdez73/hystrix-dashboard
