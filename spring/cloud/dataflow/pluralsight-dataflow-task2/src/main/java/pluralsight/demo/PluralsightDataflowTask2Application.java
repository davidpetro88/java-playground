package pluralsight.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@EnableTask
@SpringBootApplication
public class PluralsightDataflowTask2Application {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightDataflowTask2Application.class, args);
	}
	
	@Bean
	public Task2 task2() {
		return new Task2();
	}
	
	public class Task2 implements CommandLineRunner {
		@Override
		public void run(String... strings) throws Exception {
			
			//do something important
			
			System.out.println("task 2 complete!");	
		}
	}
}
