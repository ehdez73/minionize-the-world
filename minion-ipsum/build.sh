#/bin/bash
mvn clean package
docker stop minion-ipsum
docker rm minion-ipsum
docker build --force-rm=true --tag=ehdez73/minion-ipsum .
docker run -d \
	-p 8880:8880 \
	--name="minion-ipsum" \
	--hostname="minion-ipsum" \
	--link eureka-server:minion-eureka-server \
	ehdez73/minion-ipsum
