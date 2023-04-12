package mavenpractice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class CalculatorTest {
	
	static Calculator staticCalc;
	
	// this happens at the very beginning, only once
	// the method must be static
	// this is useful for creating resources we want to use throughout our testing process
	@BeforeClass
	public static void startup() {
		System.out.println("Testing process starting...\n");
		staticCalc = new Calculator();
	}
	
	// this grabs the current test's name -- thanks, Lily!!
	@Rule
	public TestName testName = new TestName();
	
	// this happens before EACH test method
	// useful for creating temporary resources we want to reset for each method
	@Before
	public void methodStartup() {
		// using the TestName object to get the name and include it
		System.out.println("Test method " + testName.getMethodName() + " starting...");
	}
	

	// this is an annotation
	// in this case, it tells us that the following method is a unit test
	// test methods should be public void
	@Test
	public void additionOverflow() {
		//int sum = staticCalc.add(Integer.MAX_VALUE, 1);
		// assertThrows checks if an exception of some kind (can be specific) has been thrown
		System.out.println("* * ADDITION OVERFLOW * *");
		assertThrows(Exception.class, () -> {
			staticCalc.add(Integer.MAX_VALUE, 1);
		});
	}
	
	@Test
	public void additionUnderflow() {
		System.out.println("* * ADDITION UNDERFLOW * *");
		assertThrows(Exception.class, () -> {
			staticCalc.add(Integer.MIN_VALUE, -1);
		});
	}
	
	@Test
	public void basicAddition() throws Exception {
		System.out.println("* * BASIC ADDITION * *");
		int sum = staticCalc.add(2, 3);
		assertEquals(5, sum, 0.0);
	}
	
	@Test
	public void calculatorName() {
		System.out.println("* * CALCULATOR NAME * *");
		Calculator calc = new Calculator("Test Calculator", 20);
		assertTrue(calc.getName().equals("Test Calculator"));
	}
	
	@Test
	public void properDivision() {
		System.out.println("* * PROPER DIVISION * *");
		double sum = staticCalc.divide(1, 2);
		assertEquals(0.5, sum, 0.0);
	}
	
	@Test
	public void divideByZero() {
		System.out.println("* * DIVIDE BY ZERO * *");
		assertThrows(ArithmeticException.class, () -> {
			staticCalc.divide(7, 0);
		});
	}
	
	@Test
	public void setMinimumNumberOfKeys() {
		System.out.println("* * SET MINIMUM NUMBER OF KEYS * *");
		Calculator calc = new Calculator();
		calc.setNumberOfKeys(7);
		assertEquals(15, calc.getNumberOfKeys(), 0.0);
	}
	
	
	
	// this happens after EACH test method
	// useful for removing/nullifying/resetting temporary resources
	@After
	public void methodTeardown() {
		System.out.println("Test method complete.\n");
	}
	
	
	// this happens after all the tests have run, only once
	// useful for tearing down resources used throughout
	@AfterClass
	public static void shutdown() {
		System.out.println("Testing process complete!");
		staticCalc = null;
	}

}
