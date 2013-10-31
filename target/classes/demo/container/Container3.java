package demo.container;

import demo.implementations.ServiceAImpl;
import demo.implementations.ServiceBImpl;
import demo.implementations.ServiceCImpl3;
import demo.interfaces.ServiceCInterface;

/**
 * Manual setter dependency injection
 * @author ivy4293
 *
 */
public class Container3 {
	public static void main(String[] args) {
		ServiceCImpl3 cImpl3 = new ServiceCImpl3();
		cImpl3.setaInterface(new ServiceAImpl());
		cImpl3.setbInterface(new ServiceBImpl());
		ServiceCInterface cInterface = cImpl3;
		cInterface.sayC();
	}
}
