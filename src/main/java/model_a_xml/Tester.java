package model_a_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext =new  ClassPathXmlApplicationContext("modifier.xml");
		Car car = (Car)applicationContext.getBean("car"); 
		System.out.println(car);
		
		Bike bike = (Bike) applicationContext.getBean("bike");
		System.out.println(bike);
	}
} 
                                                    