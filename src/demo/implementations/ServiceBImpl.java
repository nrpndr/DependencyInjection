package demo.implementations;

import demo.interfaces.ServiceBInterface;

public class ServiceBImpl implements ServiceBInterface {

	@Override
	public void sayB() {
		System.out.println("hello I am service B implementation");
	}

}
