package model_b_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester1 {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("model_b/NewFile.xml");
		
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);
		System.out.println(car.hashCode());
		
		Bike bike = (Bike) applicationContext.getBean("bike");
		Bike bike1 = (Bike) applicationContext.getBean("bike");
		System.out.println(bike1 +"   " + bike);
		System.out.println(bike.hashCode());
		
		
	}

	@Override
	public String toString() {
		return "Tester1 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
