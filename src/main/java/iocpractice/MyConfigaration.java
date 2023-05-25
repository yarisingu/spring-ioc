package iocpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("iocpractice")
public class MyConfigaration {
	
	@Bean
	public Chocolate eat()
	{
		return new Chocolate();
	}

}
