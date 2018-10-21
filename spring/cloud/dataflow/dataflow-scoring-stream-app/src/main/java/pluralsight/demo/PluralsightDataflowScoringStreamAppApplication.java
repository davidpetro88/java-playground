package pluralsight.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableConfigurationProperties(TollReadingProperties.class)
@EnableBinding(Processor.class)
@SpringBootApplication
public class PluralsightDataflowScoringStreamAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightDataflowScoringStreamAppApplication.class, args);
	}
	
	@Autowired
	private TollReadingProperties properties;
	
	@StreamListener(Processor.INPUT)
	@SendTo(Processor.OUTPUT)
	public TollReading AssignScore(TollReading r) {
		
		System.out.println("station is " + r.getStationid());
		
		int fraudThreshold = properties.getFraudThreshold();
		int fraudProbabiliyScore = 0;
		
		if(r.getStationid() == 110) {
			//in real life, pull from cache that stores constantly-updated result of calculation
			fraudProbabiliyScore = 30;
		}
		
		if(fraudProbabiliyScore > fraudThreshold) {
			r.setIsFraud(true);
		}
		
		return r;
	}
	
}
