#/bin/bash
./gradlew clean build
docker stop minion-characters
docker rm minion-characters
docker build --force-rm=true --tag=ehdez73/minion-characters .
docker run -d \
	-p 8881:8881 \
	--name="minion-characters" \
	--hostname="minion.characters.machine" \
	--link eureka-server:minion.eureka.machine \
	--link config-server:minion.conifg.machine \
	ehdez73/minion-characters
