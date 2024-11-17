package BasicConcepts;

import org.testng.annotations.Test;

public class InvocationCount {
	
	/**
	 * When you wish to run the same tests several times, you use invocation count. 
	 * In TestNG, the @Test(invocationCount=x)
	 * Invocation count should be positive, we can't use 0 and negative values
	 * by default invocation count will be consider as 1
	 */
	
	@Test(invocationCount=1)
	private void m1() {
 System.out.println("incocation count");		

	}

}
