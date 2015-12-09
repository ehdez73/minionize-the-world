FROM ehdez73/docker-jdk8
maintainer Ernesto Hdez., ehdez73@gmail.com

ADD build/libs/minion-ipsum-0.0.1-SNAPSHOT.jar /tmp/minion-ipsum.jar
EXPOSE 8880
ENTRYPOINT ["java", "-jar", "/tmp/minion-ipsum.jar"]
