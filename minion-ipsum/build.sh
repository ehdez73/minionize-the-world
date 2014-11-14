#/bin/bash
mvn package
docker build -t ehdez73/minion-ipsum .
docker run -d -p 8880:8880 --name="minion-ipsum" --hostname="sirius-minion-ipsum" ehdez73/minion-ipsum
