package stream.tollintake.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding(Sink.class)
@SpringBootApplication
public class PluralsightStreamTollintakeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightStreamTollintakeApplication.class, args);
	}

	@StreamListener(Sink.INPUT)
	public void logfast1(String msg) {
		System.out.println("fast = " + msg);
		//return msg;
	}


	//@ServiceActivator(inputChannel=Sink.INPUT)
	//@SendTo(Processor.OUTPUT)
	@StreamListener(target=Sink.INPUT, condition="headers['speed'] > 40")
	public void logfast(String msg) {
		System.out.println("fast = " + msg);
		//return msg;
	}
	
	@StreamListener(target=Sink.INPUT, condition="headers['speed'] <= 40")
	public void logslow(String msg) {
		System.out.println("slow = " + msg);
		//return msg;
	}
}
