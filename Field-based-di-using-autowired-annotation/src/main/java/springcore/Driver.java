package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(myConfig.class);
		Bank b = context.getBean(Bank.class);
		System.out.println(b);
		b.netBanking();
		
	}
}
