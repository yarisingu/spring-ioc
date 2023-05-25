package model_a2_anotation;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim{

	@Override
	public String toString() {
		return "This is jio sim";
	}

}
