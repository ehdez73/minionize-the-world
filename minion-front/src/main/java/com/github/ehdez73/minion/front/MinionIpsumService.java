package com.github.ehdez73.minion.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class MinionIpsumService {
	
	@Autowired
	private RestTemplate template;
	
	@HystrixCommand(fallbackMethod="getFallbackText")
	public Message getMinionText(){
		Message minionMessage = template.getForObject("http://minion-ipsum/minion-ipsum", Message.class);
		return new Message(format(minionMessage.getMessage()));
	}
	
	public Message getFallbackText(){
		return new Message("Ahhhhh! No banana");
	}
	
	private String format(String text){
		return text.replaceAll("\n", "<br/>");
	}
	
	public static class Message {
		
		public Message() {
			super();
		}
		
		public Message(String message) {
			super();
			this.message = message;
		}

		private String message;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
		
		
		
	}
}
