#/bin/bash
mvn clean package
docker stop minion-front
docker rm minion-front
docker build --force-rm=true --tag=ehdez73/minion-front .
docker run -d -p 8080:8080 --name="minion-front" --hostname="sirius-minion-front" ehdez73/minion-front
