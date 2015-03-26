package com.github.ehdez73.minion.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.ehdez73.minion.front.MinionIpsumService.Message;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableHystrix
@EnableHystrixDashboard
@EnableEurekaClient
@EnableZuulProxy
@EnableDiscoveryClient
@Controller
public class Application {
	
	@Autowired
	private MinionIpsumService minionIpsumService;
	
	@Autowired
	private MinionCharacterService minionCharacterService;
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

	@RequestMapping("/dashboard")
	public String home() {
		return "forward:/hystrix/index.html";
	}

	@RequestMapping("/")
	public String minion(Model model){
		Minion minion = minionCharacterService.getMinionCharacter();
		Message message = minionIpsumService.getMinionText();

		model.addAttribute("minionIpsum", message.getMessage());
		model.addAttribute("minionName", minion.getName());
		model.addAttribute("minionImage", minion.getImage());
		
		return "minion";
	}
	
}
