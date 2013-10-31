package demo.implementations;

import demo.interfaces.ServiceAInterface;
import demo.interfaces.ServiceBInterface;
import demo.interfaces.ServiceCInterface;

/**
 * {@code ServiceCInterface} constructor Dependency Injection Implementation
 * @author ivy4293
 *
 */
public class ServiceCImpl2 implements ServiceCInterface {
	
	private ServiceAInterface aInterface;
	private ServiceBInterface bInterface;
	
	public ServiceCImpl2(ServiceAInterface aInterface, ServiceBInterface bInterface){
		this.aInterface = aInterface;
		this.bInterface = bInterface;
	}

	@Override
	public void sayC() {
		aInterface.sayA();
		bInterface.sayB();
		System.out.println("hello I am service C implementation that uses a contructor Dependency Injection");
	}
}
