Minionize the world
===================

MicroService architecure example with [Spring Cloud Netflix](http://cloud.spring.io/spring-cloud-netflix/)  and [Docker](https://docker.com)

![Minionize the world](https://github.com/ehdez73/minionize-the-world/blob/master/minionize-the-world.png)


**Build and run**
 

```
        $ cd scripts
        $ ./build-all.sh
```
 

**Run with docker compose**

 Once the docker images have been created you can also run them with docker-compose
 
```
     $ cd scripts
     $ docker-compose up       
     
```

---
***Install JCE***

If you want to use encrypting with Spring Cloud Config

   Download the "Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files" from Oracle, and follow instructions for installation (essentially replace the 2 policy files in the JRE lib/security directory with the ones that you downloaded).

Note: JCE is already configured in the config-server docker container.

--- 
***Configure your host file***

If you run the applications outside Docker, you must add this entries to your /etc/hosts

```
        172.17.42.1     docker0
        172.17.42.1     minion.eureka.machine
        172.17.42.1     minion.front.machine
        172.17.42.1     minion.ipsum.machine
        172.17.42.1     minion.characters.machine
        172.17.42.1     minion.config.machine
        172.17.42.1     minion.hystrix.machine
```

Also, if you want to use DNS resolution with the microservices instances instead of linking the docker containers:

1. Install dnsmasq

2. Modify your /etc/default/docker.io config file
```  
      DOCKER_OPTS="--dns 172.17.42.1 --dns 8.8.8.8"
```
3.  start dnsmasq
``` 
     $ sudo service dnsmasq restart
```     

