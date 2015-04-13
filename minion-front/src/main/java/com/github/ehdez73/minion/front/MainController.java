package com.github.ehdez73.minion.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.ehdez73.minion.front.MinionIpsumService.Message;

@RefreshScope
@Controller
public class MainController {
	
	@Autowired
	private MinionIpsumService minionIpsumService;
	
	@Autowired
	private MinionCharacterService minionCharacterService;
	
	@Value("${message}")
	private String title;
	
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
		model.addAttribute("title", title);
		
		return "minion";
	}
	
}
