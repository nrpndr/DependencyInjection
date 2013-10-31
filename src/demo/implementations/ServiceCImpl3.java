package demo.implementations;

import demo.interfaces.ServiceAInterface;
import demo.interfaces.ServiceBInterface;
import demo.interfaces.ServiceCInterface;

/**
 * {@code ServiceCInterface} setter Dependency Injection Implementation
 * @author ivy4293
 *
 */
public class ServiceCImpl3 implements ServiceCInterface {
	
	private ServiceAInterface aInterface;
	private ServiceBInterface bInterface;

	@Override
	public void sayC() {
		aInterface.sayA();
		bInterface.sayB();
		System.out.println("hello I am service C implementation that uses a setter Dependency Injection");
	}

	public ServiceAInterface getaInterface() {
		return aInterface;
	}

	public void setaInterface(ServiceAInterface aInterface) {
		this.aInterface = aInterface;
	}

	public ServiceBInterface getbInterface() {
		return bInterface;
	}

	public void setbInterface(ServiceBInterface bInterface) {
		this.bInterface = bInterface;
	}

}
