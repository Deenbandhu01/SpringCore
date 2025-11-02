package springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("myConfig.xml");
		Library s = factory.getBean("myLibrary",Library.class);
		System.out.println(s);
		
	}
}
