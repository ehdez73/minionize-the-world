#/bin/bash
mvn package
docker build -t ehdez73/minion-characters .
docker run -d -p 8881:8881 --name="minion-characters" --hostname="sirius-minion-characters" ehdez73/minion-characters
