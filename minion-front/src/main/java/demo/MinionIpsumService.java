package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class MinionIpsumService {
	
	@Autowired
	private RestTemplate template;

	@HystrixCommand(fallbackMethod="getFallbackText")
	public String getMinionText(){
		String text = template.getForObject("http://minion-ipsum/minion-ipsum", String.class);
		return format(text);
	}
	
	public String getFallbackText(){
		return "Ahhhhh! No banana";
	}
	
	private String format(String text){
		return text.replaceAll("\n", "<br/>");
	}
}
