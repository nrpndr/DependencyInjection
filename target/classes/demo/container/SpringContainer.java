package demo.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.interfaces.ServiceCInterface;


public class SpringContainer {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		
		//setter dependency Injection
		ServiceCInterface cInterface = (ServiceCInterface)context.getBean("serviceC1");
		cInterface.sayC();
		
		//constructor dependency Injection
		ServiceCInterface cInterface2 = (ServiceCInterface)context.getBean("serviceC2");
		cInterface2.sayC();
	}
}
