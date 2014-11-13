#/bin/bash
mvn package
docker build -t ehdez73/eureka .
docker run -d -p 8761:8761 --name="eureka" ehdez73/eureka
