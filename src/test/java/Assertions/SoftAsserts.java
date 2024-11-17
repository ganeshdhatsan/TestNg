package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts {
	
	/**
	 * Soft Assert – collects the errors during @Test. 
	 * Soft Assert does not throw an exception if assert fails 
	 * and will continue with the next step after the assert statement.
	 * If there is any exception and you want to throw it 
	 * then you need to use assertAll() method as a last statement in the @Test 
	 * At the end of the test, call assertAll() to report failures
	 * assertAll() will collect all the errors and finally,throw as an exception and fails the test
	 * if we are declaring assertAll() in middle at code, after assertAll(),next line of code won't executed
	 * We need to create an object to use Soft Assert which is not needed in Hard Assert.
	 */
	
	/**
	 * SoftAssert assert = new SoftAssert();
	 * 1.assert.assertEquals() Compares two values (actual vs expected)   --> pass
	 * 2.assert.assertNotEquals() Verifies that two values are not equal  --> pass
	 * 3.ssert.assertTrue(true/false) Verifies that a condition is true
	 * 4.assert.assertFalse(true/false) Verifies that a condition is false
	 * 5.assert.assertNull() Verifies that an object is null
	 * 6.assert.assertNotNull() Verifies that an object is not null 
	 * 7.assert.fail() Forces a test to fail when it's called
	 */
	

	/**
	 * Purpose of Soft Assert: to check non-mandatory fields
Comprehensive Testing: It helps in identifying multiple issues in a single test run instead of stopping at the first failure.
Improved Reporting: You can see all assertion failures in one go, making it easier to diagnose issues.
Flow Continuity: Useful in scenarios where you want to verify multiple conditions without terminating the test early, especially in UI tests or when validating multiple inputs.
	 * 
	 */
	
	@Test
	private void assertTrueMethod() {
		SoftAssert softAssert = new SoftAssert();
		
		System.out.println("line 1");
		System.out.println("line 2");
		softAssert.assertTrue(false);
		
		System.out.println("line 3");
		System.out.println("line 4");
		softAssert.assertFalse(true);
		
		System.out.println("line 5");
		System.out.println("line 6");

	}

	@Test
	private void assertAllMethod1() {
		SoftAssert softAssert = new SoftAssert();
		
		System.out.println("line 1");
		System.out.println("line 2");
		softAssert.assertTrue(false);
		
		System.out.println("line 3");
		System.out.println("line 4");
		softAssert.assertFalse(true);
		
		System.out.println("line 5");
		System.out.println("line 6");
		
		softAssert.assertAll();

	}
	
	@Test
	private void assertAllMethod2() {
		SoftAssert softAssert = new SoftAssert();
		
		System.out.println("line 1");
		System.out.println("line 2");
		softAssert.assertTrue(false);
		
		System.out.println("line 3");
		
		softAssert.assertAll();
		
		System.out.println("line 4");
		softAssert.assertFalse(true);
		
		System.out.println("line 5");
		System.out.println("line 6");
		
		
	}

	
}
