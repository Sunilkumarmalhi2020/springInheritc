package springCoreInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String arg[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("configDept.xml");
		Student objct=(Student)context.getBean("student1");
		System.out.println(objct.toString());
	}
}
