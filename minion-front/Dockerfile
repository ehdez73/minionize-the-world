FROM ehdez73/docker-jdk8
maintainer Ernesto Hdez., ehdez73@gmail.com

ADD build/libs/minion-front-0.0.1-SNAPSHOT.jar /tmp/minion-front.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/tmp/minion-front.jar"]
