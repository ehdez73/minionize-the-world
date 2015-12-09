#/bin/bash
./gradlew build
docker stop config-server
docker rm config-server
docker build --force-rm=true --tag=ehdez73/config-server .
docker run -d \
	-p 8888:8888 \
	--name="config-server" \
	--hostname="minion.config.machine" \
	--link eureka-server:minion.eureka.machine \
	ehdez73/config-server
