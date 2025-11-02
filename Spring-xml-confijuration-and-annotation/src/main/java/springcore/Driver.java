package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext c = new AnnotationConfigApplicationContext(MyConfig.class);
		Person p = (Person)c.getBean("person");
		System.out.println(p);
		Book b = c.getBean("myBook",Book.class);
		System.out.println(b);
		
		Book b1 = c.getBean(Book.class);
		System.out.println(b1);
		
	}
}
