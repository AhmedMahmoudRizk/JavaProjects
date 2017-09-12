package eg.edu.alexu.csd.oop.calculator.cs18;

import static org.junit.Assert.*;

//import eg.edu.alexu.csd.TestRunner;
import eg.edu.alexu.csd.oop.calculator.Calculator;

public class IntegrationTest {
	
	public static Class<?> getSpecifications(){
		return Calculator.class;
	}
	
	@org.junit.Test
	public void testCreation() {
		Calculator instance = new the_hard_work();
		assertNotNull("Failed to create Engine using '" + getSpecifications().getName() + "' !", instance);
	}

}
