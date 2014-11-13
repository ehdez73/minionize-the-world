FROM dockerfile/java
maintainer Ernesto Hdez, ehdez73@gmail.com
ADD target/minion-ipsum-0.0.1-SNAPSHOT.jar /tmp/minion-ipsum.jar
EXPOSE 8880
ENTRYPOINT ["java", "-jar", "/tmp/minion-ipsum.jar"]
