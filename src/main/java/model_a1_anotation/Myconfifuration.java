package model_a1_anotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("model_a1_anotation")
public class Myconfifuration {

	
	
	@Bean("a1")
	public Mobile mybean()
	{
		return new Mobile("object1");
	}
	
	@Bean("a2")
	public Mobile mybean1()
	{
		return new Mobile("object2");
	}
	
}
