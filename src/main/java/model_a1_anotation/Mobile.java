package model_a1_anotation;


import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("abc")
//@Scope("prototype") // by default it is singleton
//@Lazy // by default it is eager i.e lazy is false 
public class Mobile {
	
	public Mobile()
	{
		System.out.println("get object ");
	}
	
	public Mobile(String c)
	{
		System.out.println("get object " +c);
	}
}
