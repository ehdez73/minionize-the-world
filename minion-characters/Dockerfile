FROM dockerfile/java
maintainer Ernesto Hdez, ehdez73@gmail.com
ADD target/minion-characters-0.0.1-SNAPSHOT.jar /tmp/minion-characters.jar
EXPOSE 8880
ENTRYPOINT ["java", "-jar", "/tmp/minion-characters.jar"]
