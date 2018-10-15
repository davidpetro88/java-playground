package eureka.demo.fastpass.console;

import java.util.Random;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.integration.annotation.Poller;


@EnableBinding(TollSource.class)
public class TollPublisher {

	//@InboundChannelAdapter(channel=Source.OUTPUT)
	//public String sendTollCharge() {
	//	return "{station:\"20\", customerid:\"100\", timestamp:\"2017-07-12T03:15:00\"}";
	//}

	Random r = new Random();

	@Bean
	//@InboundChannelAdapter(channel="fastpassTollChannel", poller=@Poller(fixedDelay="2000"))
	public MessageSource<Toll> sendTollCharge() {

		return () -> MessageBuilder.withPayload(new Toll("20","100","2017-07-12T12:04:00")).setHeader("speed", r.nextInt(8) * 10).build();
	}

	class Toll {
		public String stationId;
		public String customerId;
		public String timestamp;

		public Toll(String StationId, String CustomerId, String Timestamp) {
			this.stationId = StationId;
			this.customerId = CustomerId;
			this.timestamp = Timestamp;
		}
	}

}
