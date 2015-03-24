FROM dockerfile/java:oracle-java8
maintainer Ernesto Hdez., ehdez73@gmail.com
ADD target/eureka-server-1.0.0-M1.jar /tmp/eureka-server.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/tmp/eureka-server.jar"]
