FROM dockerfile/java
maintainer Ernesto Hdez., ehdez73@gmail.com
ADD target/hystrix-dashboard-1.0.0.M1.jar /tmp/hystrix-dashboard.jar
EXPOSE 7979
ENTRYPOINT ["java", "-jar", "/tmp/hystrix-dashboard.jar"]
