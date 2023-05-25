package model_a2_anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;





public class Tester {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Myconfifuration.class);
		Mobile mobile = (Mobile) context.getBean("abc");
		System.out.println(mobile);
	}
}
