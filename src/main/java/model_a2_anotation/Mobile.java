package model_a2_anotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("abc")
public class Mobile {

	@Value("onepuls")
	String brand;
	@Value("512")
	int ram;
	
//	@Autowired
//	Airtel sim;
//	
//	@Autowired
//	Jio sim1;
	
	
	@Autowired
	@Qualifier("jio")
	Sim sim;

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", ram=" + ram + ", sim=" + sim + "]";
	}

	
	
	
	
	
	
}
