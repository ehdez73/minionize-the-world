FROM dockerfile/java:oracle-java8
maintainer Ernesto Hdez., ehdez73@gmail.com
RUN  wget --no-check-certificate --no-cookies --header "Cookie: oraclelicense=accept-securebackup-cookie" http://download.oracle.com/otn-pub/java/jce/7/UnlimitedJCEPolicyJDK7.zip; \
     unzip UnlimitedJCEPolicyJDK7.zip; \
     mv -f UnlimitedJCEPolicy/*.jar /usr/lib/jvm/java-8-oracle/jre/lib/security/.

ADD target/config-server-0.0.1-SNAPSHOT.jar /tmp/config-server.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "/tmp/config-server.jar"]