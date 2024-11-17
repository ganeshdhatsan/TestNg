package BasicConcepts;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class Priority {
	
	/**
	 *-1.The syntax for test priority is @Test (priority = x),
	 * where x can be any integer –> negative, zero, or positive.
	 *
	 *0.If test priority is not defined explicitly for multiple tests, 
	 *TestNG assigns all tests with a Default test priority, i.e., zero (0).So default value is 0.
	 *1. In cases where there are multiple test methods without any Test priority, 
	 * the test methods will run in an ASSCCI value of alphabetical order.
	 *2.Negative Priority can be assigned to any test method 
	 * when you want to have higher precedence over the test methods with default priority.
	 *3.One test method is allowed to have only one test priority in TestNG.  
	 * 4.In Java, the range of an int starts from -2,147,483,648 to 2,147,483,647. 
	 * So, technically, you can assign any integer within this range to the priority attribute.
	 * 
	 */
	
	/*Exceptional case
	 * If you use both priority and dependsOnMethods in the same test class, 
	 * TestNG will prioritize method dependencies first before considering method priorities.
	 */
	
//	@Test(priority = Integer.MAX_VALUE)  // Highest possible priority
//	public void testMaxPriority() {
//	    System.out.println("This test has the highest priority.");
//	}
//
//	@Test(priority = Integer.MIN_VALUE)  // Lowest possible priority
//	public void testMinPriority() {
//	    System.out.println("This test has the lowest priority.");
//	}

//	@Test(priority = -2) 
//	public void basic()
//	{ 
//	} 
//	@Test(priority = -1) 
//	public void getURL()
//	{ 
//	} 
//	@Test(priority = 0) 
//	public void getTitle()
//	{ 
//	} 
//	@Test(priority = 1) 
//	public void closeBrowser()
//	{
//}
//	@Test(priority=2)
//	public void clasic() {	
//	}
	
	@Test
	private void aa() {
		
	}
	@Test
	private void aA() {
		
	}
	
	
}
