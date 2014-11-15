FROM dockerfile/java
maintainer Ernesto Hdez., ehdez73@gmail.com
ADD target/config-server-0.0.1-SNAPSHOT.jar /tmp/config-server.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "/tmp/config-server.jar"]
