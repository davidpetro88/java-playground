package pluralsight.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableTask
@EnableConfigurationProperties(Task1Properties.class)
@SpringBootApplication
public class PluralsightDataflowTask1Application {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightDataflowTask1Application.class, args);
	}
	
	@Bean
	public Task1 task1() {
		return new Task1();
	}
	
	public class Task1 implements CommandLineRunner {
		
		@Autowired
		private Task1Properties config;
		
		@Override
		public void run(String... strings) throws Exception {
			
			System.out.println("source: " + config.getSourceFilePath());
			System.out.println("destination: " + config.getDestinationFilePath());
			System.out.println("control message: " + config.getControlMessage());
			
			if(config.getControlMessage().equals("fail")) {
				System.out.println("throwing an exception ...");
				throw new Exception("I'm ANGRY");
			}
			
			System.out.println("task 1 complete!");
			
		}
	}
}
