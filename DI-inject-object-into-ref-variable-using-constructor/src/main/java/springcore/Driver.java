package springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("myConfig.xml");
		Passenger p= factory.getBean("myPassenger", Passenger.class);
		System.out.println(p);
		p.travel();
				
	}
}
