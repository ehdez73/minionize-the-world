package demo;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
public class Application {
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	private Random random = new Random();
	private String[] bananaArray = {"pepete","aaaaaah","uuuhhh","jiji","hahaha","jeje","wiiiii","bananaaaa","bappleees","potatoooo","para tú","la bodaaa","poulet tikka masala","daa","hana dul sae","belloo!","poopayee","tank yuuu!","me want bananaaa!","underweaaar","bee do bee do bee do","tulaliloo","ti aamoo!","tatata bala tu","baboiii","po kass","gelatooo","butt","chasy"};
	
	
	@RequestMapping("/minion-ipsum")
	public String getMinionIpsum(){
		int paragraphsNumber = random.nextInt(4) + 1;
		StringBuffer resultText = new StringBuffer();
		for (int i=0; i< paragraphsNumber; i++) {
			resultText.append(generateParagraph(i));
			if (i<paragraphsNumber-1){
				resultText.append("\n\n");
			}
		}
		
		String result = resultText.toString();
		log.debug(result);
		return result;
		
	}

    private String generateParagraph(int paragraphNumber) {
    	StringBuffer result = new StringBuffer();
    	int linesNumber = random.nextInt(4) + 1; 
    	for( int i=0; i< linesNumber; i++ ){
    		result.append(generateLine(i, paragraphNumber));
    	}
		return result.toString();
	}

	private String generateLine(int lineNumber, int paragraphNumber) {
		StringBuffer line = new StringBuffer();
		int wordsNumber = random.nextInt(10) + 4;
		for (int i=0; i<wordsNumber; i++){
			String word = paragraphNumber==0 && lineNumber== 0 && i==0 ? "Minion Ipsum" : generateWord();
			if (i==0){
				word = capitalize(word);
			}
			line.append(word);
			if (i<wordsNumber-1){
				line.append(" ");
			} else {
				line.append(". ");
			}
		}
		return line.toString();
	}

	private String capitalize(String word) {
		return word.substring(0, 1).toUpperCase() + word.substring(1);
	}

	private String generateWord() {
		int wordIndex = random.nextInt(bananaArray.length);
		return bananaArray[wordIndex];
	}

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
