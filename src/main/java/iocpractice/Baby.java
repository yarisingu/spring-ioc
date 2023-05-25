package iocpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class Baby {

	@Autowired
	 IceCream ice;
	
	public  String  eat() {
		
		ice.eat();
		return "Baby opened The Packet" ;
		
	}
}
