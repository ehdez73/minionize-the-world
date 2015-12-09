FROM ehdez73/docker-jdk8
maintainer Ernesto Hdez., ehdez73@gmail.com

ADD build/libs/minion-characters-0.0.1-SNAPSHOT.jar /tmp/minion-characters.jar
EXPOSE 8881
ENTRYPOINT ["java", "-jar", "/tmp/minion-characters.jar"]
