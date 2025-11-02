package springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("myConfig.xml");
		Person p = (Person)factory.getBean("myPerson");
		System.out.println(p);
		Employee e = factory.getBean("myEmp", Employee.class);
		System.out.println(e);
		
	}
}
