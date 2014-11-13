#/bin/bash
mvn package
docker build -t ehdez73/hystrix .
docker run -d -p 7979:7979 --name="hystrix" --hostname="hystrix" ehdez73/hystrix
