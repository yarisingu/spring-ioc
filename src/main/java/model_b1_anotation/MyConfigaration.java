package model_b1_anotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("model_b1_anotation")
public class MyConfigaration {
	
	public Sim getSim()
	{
		return new Airtel();
	}

}
