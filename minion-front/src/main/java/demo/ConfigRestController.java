package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConfigRestController {
	
	@Value("${secret:'no-secret'}")
	private String secret;
	
	@Value("${info.description}")
	private String info;
	
	@RequestMapping("/secret")
	public Info getSecret(){
		return new Info(secret,info);
	}
	
	public static class Info {
		
		public Info(String secret, String info) {
			super();
			this.secret = secret;
			this.info = info;
		}
		String secret;
		String info;
		public String getSecret() {
			return secret;
		}
		public void setSecret(String secret) {
			this.secret = secret;
		}
		public String getInfo() {
			return info;
		}
		public void setInfo(String info) {
			this.info = info;
		}
		
		
	}

}
