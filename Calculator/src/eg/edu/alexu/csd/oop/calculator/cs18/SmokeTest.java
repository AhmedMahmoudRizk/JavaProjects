package eg.edu.alexu.csd.oop.calculator.cs18;

import static org.junit.Assert.*;

//import eg.edu.alexu.csd.TestRunner;
import eg.edu.alexu.csd.oop.calculator.Calculator;

public class SmokeTest {
	
	public static Class<?> getSpecifications(){
		return Calculator.class;
	}
	
	@org.junit.Test
	public void testOperation() {
		Calculator instance = new the_hard_work();
		String result = null;

		try {
			instance.input("3+4");
		} catch (Throwable e) {
			TestRunner.fail("Fail to set input '3+4'", e);
		}
		try {
			result = instance.getResult();
			assertEquals("Addition doesn't work '3+4'", "7.0", result);
		} catch (Throwable e) {
			TestRunner.fail("Fail to get result of '3+4'", e);
		}


		try {
			instance.input("3-4");
		} catch (Throwable e) {
			TestRunner.fail("Fail to set input '3-4'", e);
		}
		try {
			result = instance.getResult();
			assertEquals("Subtraction doesn't work '3-4'", "-1.0", result);
		} catch (Throwable e) {
			TestRunner.fail("Fail to get result of '3-4'", e);
		}

		try {
			instance.input("3/4");
		} catch (Throwable e) {
			TestRunner.fail("Fail to set input '3/4'", e);
		}
		try {
			result = instance.getResult();
			assertEquals("Division doesn't work '3/4'", "0.75", result);
		} catch (Throwable e) {
			TestRunner.fail("Fail to get result of '3/4'", e);
		}

		try {
			instance.input("3*4");
		} catch (Throwable e) {
			TestRunner.fail("Fail to set input '3*4'", e);
		}
		try {
			result = instance.getResult();
		} catch (Throwable e) {
			TestRunner.fail("Fail to get result of '3*4'", e);
		}
		assertEquals("Multiplication doesn't work '3*4'", "12.0", result);
	}

	@org.junit.Test
	public void testHistory() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Calculator instance = new the_hard_work();
		try {
			instance.input("1+2");
		} catch (Throwable e) {
			fail("Fail to set input '1+2");
		}
		try {
			instance.input("2+3");
		} catch (Throwable e) {
			fail("Fail to set input '2+3");
		}
		try {
			instance.input("3+4");
		} catch (Throwable e) {
			fail("Fail to set input '3+4");
		}
		try {
			instance.input("4+5");
		} catch (Throwable e) {
			fail("Fail to set input '4+5");
		}
		try {
			instance.input("5+6");
		} catch (Throwable e) {
			fail("Fail to set input '5+6");
		}
		try {
			instance.input("6+7");
		} catch (Throwable e) {
			fail("Fail to set input '6+7");
		}
		try {
			assertEquals("Current 1 Fails", "6+7", instance.current());
			assertEquals("Prev 1 Fails", "5+6", instance.prev());
			assertEquals("Prev 2 Fails", "4+5", instance.prev());
			assertEquals("Prev 3 Fails", "3+4", instance.prev());
			assertEquals("Prev 4 Fails", "2+3", instance.prev());
			assertEquals("Prev 5 Fails", null, instance.prev());
			assertEquals("Prev 6 Fails", null, instance.prev());
			assertEquals("Current 2 Fails", "2+3", instance.current());
			assertEquals("Next 1 Fails", "3+4", instance.next());
		} catch (Throwable e) {
			TestRunner.fail("History Fails", e);
		}
	}
	@org.junit.Test
	public void testHistory_1() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Calculator instance = new the_hard_work();
		try {
			instance.input("1+2");
		} catch (Throwable e) {
			fail("Fail to set input '1+2");
		}
		try {
			instance.input("3*4");
		} catch (Throwable e) {
			fail("Fail to set input '3*4");
		}
		try {
			instance.input("2-5");
		} catch (Throwable e) {
			fail("Fail to set input '2-5");
		}
		try {
			instance.input("22/7");
		} catch (Throwable e) {
			fail("Fail to set input '22/7");
		}
		try {
			instance.input("1/12");
		} catch (Throwable e) {
			fail("Fail to set input '1/12");
		}

		try {
			assertEquals("Current 1 Fails", "1/12", instance.current());
			assertEquals("Prev 1 Fails", "22/7", instance.prev());
			
			
			

			assertEquals("Prev 2 Fails", "2-5", instance.prev());
			assertEquals("next 1 Fails", "22/7", instance.next());
			assertEquals("Prev 4 Fails", "2-5", instance.prev());
			assertEquals("Prev 5 Fails", "3*4", instance.prev());
			assertEquals("Prev 6 Fails", "1+2", instance.prev());
			assertEquals("Prev 7 Fails", null, instance.prev());
			assertEquals("Prev 8 Fails", null, instance.prev());
			assertEquals("Current 2 Fails", "1+2", instance.current());
			assertEquals("Next 2 Fails", "3*4", instance.next());
			assertEquals("Current 3 Fails", "3*4", instance.current());
			instance.save();
		} catch (Throwable e) {
			TestRunner.fail("History Fails", e);
		}
		try {
			instance.input("0*0");
		} catch (Throwable e) {
			fail("Fail to set input '0*0");
		}
		try {

			assertEquals("Current 4 Fails", "0*0", instance.current());
			assertEquals("Prev 9 Fails", "1/12", instance.prev());
			instance.load();
//			instance.input(instance.current());
//			assertEquals("Current 3 Fails", "12.0", instance.getResult());

			assertEquals("Current 5 Fails", "3*4", instance.current());
			assertEquals("Prev 10 Fails", "2-5", instance.next());
			assertEquals("Prev 11 Fails", "22/7", instance.next());
			assertEquals("Prev 12 Fails", "1/12", instance.next());
			assertEquals("Prev 13 Fails", null, instance.next());
			assertEquals("Prev 14 Fails", null, instance.next());
		} catch (Throwable e) {
			TestRunner.fail("History Fails", e);
		}
	}
}
