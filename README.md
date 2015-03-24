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

     $ docker-compose -f fig-base.yml up       # runs eureka, hystrix and config server
     $ docker-compose -f fig-minion-all.yml up # runs minion-front, minion-ipsum and minion-characters
```

---
***Install JCE***

If you want to use encrypting with Spring Cloud Config

   Download the "Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files" from Oracle, and follow instructions for installation (essentially replace the 2 policy files in the JRE lib/security directory with the ones that you downloaded).

Note: JCE is already configured in the config-server docker container.

--- 
*** Config your host file **
If you run the applications outside Docker, you must add this entries to your /etc/hosts

```
        172.17.42.1     docker0
        172.17.42.1     minion-eureka-server
        172.17.42.1     minion-front
        172.17.42.1     minion-ipsum
        172.17.42.1     minion-characters
        172.17.42.1     minion-config-server
        172.17.42.1     minion-hystrix-dashboard
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

