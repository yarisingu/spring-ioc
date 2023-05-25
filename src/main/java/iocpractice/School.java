package iocpractice;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class School {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigaration.class);
		Baby baby = (Baby) context.getBean("baby");
		System.out.println(baby.eat());
		
		
	}
	
	

}
