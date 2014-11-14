#/bin/bash
mvn package
docker build -t ehdez73/minion-front .
docker run -d -p 8880:8880 --name="minion-front" --hostname="sirius-minion-front" ehdez73/minion-ipsum
