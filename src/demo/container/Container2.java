package demo.container;

import demo.implementations.ServiceAImpl;
import demo.implementations.ServiceBImpl;
import demo.implementations.ServiceCImpl2;
import demo.interfaces.ServiceCInterface;

/**
 * Manual constructor dependency injection
 * @author ivy4293
 *
 */
public class Container2 {
	public static void main(String[] args) {
		ServiceCInterface cInterface = new ServiceCImpl2(new ServiceAImpl(), new ServiceBImpl());
		cInterface.sayC();
	}
}
