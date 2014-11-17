package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class MinionCharacterService {
	
	@Autowired
	private RestTemplate template;

	@HystrixCommand(fallbackMethod="getFallbackMinion")
	public Minion getMinionCharacter(){
		return template.getForObject("http://minion-characters/minion-character", Minion.class);
	}
	
	public Minion getFallbackMinion(){
		return new Minion("Evil","img/minion-evil.jpg");
	}
}
