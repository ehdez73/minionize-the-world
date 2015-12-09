#/bin/bash
./gradlew clean build
docker stop minion-ipsum
docker rm minion-ipsum
docker build --force-rm=true --tag=ehdez73/minion-ipsum .
docker run -d \
	-p 8880:8880 \
	--name="minion-ipsum" \
	--hostname="minion.ipsum.machine" \
	--link eureka-server:minion.eureka.machine \
    --link config-server:minion.conifg.machine \
	ehdez73/minion-ipsum
