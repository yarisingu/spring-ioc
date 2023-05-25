package model_b1_anotation;

import org.springframework.beans.factory.annotation.Value;

public class Mobile {
	@Value("onePlus")
	String name;
	@Value("8")
	int cost;
	
	
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", cost=" + cost + "]";
	}
	
	

}
