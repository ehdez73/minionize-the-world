#/bin/bash
mvn package
docker build -t ehdez73/minion-ipsum .
docker run -d -p 8880:8880 --name="minion-ipsum" --hostname="sirius-minion-ipsum" ehdez73/minion-ipsum
docker run -d -p 8882:8880 --name="minion-ipsum-2" --hostname="sirius-minion-ipsum-1" ehdez73/minion-ipsum
