package model_a2_anotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Airtel implements Sim{

	@Override
	public String toString() {
		return "This is Airtel sim";
	}

	
}
