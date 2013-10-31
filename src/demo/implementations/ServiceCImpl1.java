package demo.implementations;

import demo.interfaces.ServiceAInterface;
import demo.interfaces.ServiceBInterface;
import demo.interfaces.ServiceCInterface;

/**
 * Implementation with hard coded dependency.
 * @author ivy4293
 *
 */
public class ServiceCImpl1 implements ServiceCInterface {

	private ServiceAInterface aInterface = new ServiceAImpl();
	private ServiceBInterface bInterface = new ServiceBImpl();
	
	@Override
	public void sayC() {
		aInterface.sayA();
		bInterface.sayB();
		System.out.println("hello I am service C implementation that has a hard coded dependency defined");
	}

}
