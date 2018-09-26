package zuul.apiproxy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import zuul.apiproxy.demo.filters.ProxyFilter;
import zuul.apiproxy.demo.filters.StartPreFilter;
import zuul.apiproxy.demo.filters.StopPostFilter;

@EnableZuulProxy
@SpringBootApplication
public class ZuulApiproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiproxyApplication.class, args);
	}
	
	@Bean
	public ProxyFilter proxyFilter() {
		return new ProxyFilter();
	}
	
	@Bean
	public StartPreFilter startPreFilter() {
		return new StartPreFilter();
	}
	
	@Bean
	public StopPostFilter stopPostFilter() {
		return new StopPostFilter();
	}
	
}
