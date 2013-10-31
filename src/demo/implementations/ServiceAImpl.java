package demo.implementations;

import demo.interfaces.ServiceAInterface;

public class ServiceAImpl implements ServiceAInterface{

	@Override
	public void sayA() {
		System.out.println("hello I am service A implementation");
	}

}
