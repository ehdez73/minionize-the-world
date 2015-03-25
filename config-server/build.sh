#/bin/bash
mvn package
docker stop config-server
docker rm config-server
docker rmi ehdez73/config-server
docker build -t ehdez73/config-server .
docker run -d \
	-p 8888:8888 \
	--name="config-server" \
	--hostname="minion.config.machine" \
	--link eureka-server:minion.eureka.machine \
	ehdez73/config-server
