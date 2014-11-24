Minionize the world
===================

MicroService architecure example with Spring Cloud Netflix


**Build and run**
 

```
        $ cd scripts
        $ ./build-all.sh
```
 



**Run with Fig**

 Once the docker images have been created you can also run them with fig
 
```

     $ fig -f fig-base.yml up       # runs eureka, hystrix and config server
     $ fig -f fig-minion-all.yml up # runs minion-front, minion-ipsum and minion-characters
```

---
***Install JCE***

If you want to use encrypting with Spring Cloud Config

 
   Download the "Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files" from Oracle, and follow instructions for installation (essentially replace the 2 policy files in the JRE lib/security directory with the ones that you downloaded).

--- 

If you want to use DNS resolution with the microservices instances:

1. Install dnsmasq

2. Modify your /etc/default/docker.io config file
```  
      DOCKER_OPTS="--dns 172.17.42.1 --dns 8.8.8.8"
```

3.  Add this entries to your /etc/hosts
```

     172.17.42.1     Sirius docker0
     172.17.42.1     sirius-minion-front
     172.17.42.1     sirius-minion-ipsum
     172.17.42.1     sirius-minion-ipsum-2
     172.17.42.1     sirius-minion-characters
     172.17.42.1     sirius-minion-characters-2
     172.17.42.1     sirius-eureka-server
     172.17.42.1     sirius-config-server
     172.17.42.1     sirius-hystrix-dashboard
```

 4.  start dnsmasq
``` 
     $ sudo service dnsmasq restart
```     

