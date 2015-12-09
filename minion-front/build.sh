#/bin/bash
./gradlew clean build
docker stop minion-front
docker rm minion-front
docker build --force-rm=true --tag=ehdez73/minion-front .
docker run -d -p 8080:8080 \
   --name="minion-front" \
   --hostname="minion.front.machine" \
   --link config-server:minion.config.machine \
   --link eureka-server:minion.eureka.machine \
   --link minion-characters:minion.characters.machine \
   --link minion-ipsum:minion.ipsum.machine \
   ehdez73/minion-front
