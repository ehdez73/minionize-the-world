package com.github.ehdez73.minion.character;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class Application {
	Logger log = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("/minion-character")
	public Minion getMinion(){
		Minion minion = Minion.random();
		log.debug(minion.toString());
		return minion;
		
	}
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    
}
