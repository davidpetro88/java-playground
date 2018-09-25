package hystrix.turbine.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@EnableTurbineStream
@SpringBootApplication
public class PluralsightHystrixTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightHystrixTurbineApplication.class, args);
	}
}
