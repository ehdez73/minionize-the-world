FROM ehdez73/docker-jdk8
maintainer Ernesto Hdez., ehdez73@gmail.com

ADD build/libs/eureka-server-0.0.1-SNAPSHOT.jar /tmp/eureka-server.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/tmp/eureka-server.jar"]
