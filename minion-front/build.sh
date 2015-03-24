#/bin/bash
mvn clean package
docker stop minion-front
docker rm minion-front
docker build --force-rm=true --tag=ehdez73/minion-front .
docker run -d -p 8080:8080 \
   --name="minion-front" \
   --hostname="minion-front" \
   --link eureka-server:minion-eureka-server \
   --link minion-characters:minion-characters \
   --link minion-ipsum:minion-ipsum \
   ehdez73/minion-front
