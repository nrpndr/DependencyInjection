package demo.container;

import demo.implementations.ServiceCImpl1;
import demo.interfaces.ServiceCInterface;

/**
 * Uses the hard coded dependency implementation class of {@code ServiceCInterface}
 * @author ivy4293
 *
 */
public class Container1 {
	
	public static void main(String[] args) {
		ServiceCInterface cInterface = new ServiceCImpl1();
		cInterface.sayC();
	}
}
