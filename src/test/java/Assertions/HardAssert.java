package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	/*
	 * Hard Assert
	 */
	
	/*
	 * 1. values should be Actual then Expected
	 * 2.TestNG will take Expected as a reference for comparison,
	 *  based on that will compare Actual condition meets Expected condition
	 *  3.Description message  should be a negative message, because message will be
	 *  thrown only when case failed
	 *  4.If Hard Assert fails , next line of code will not be executed
	 *  5.To validate mandatory the fields
	 */

	/**
	 * 1.Assert.assertEquals() Compares two values (actual vs expected)   --> pass
	 * 2.Assert.assertNotEquals() Verifies that two values are not equal  --> pass
	 * 3.Assert.assertTrue(true/false) Verifies that a condition is true
	 * 4.Assert.assertFalse(true/false) Verifies that a condition is false
	 * 5.Assert.assertNull() Verifies that an object is null
	 * 6.Assert.assertNotNull() Verifies that an object is not null 
	 * 7.Assert.fail() Forces a test to fail when it's called
	 */
	
	/**
	 * Assert.assertEquals(obj1, obj2);
		Assert.assertEquals(array1, array2)
		Assert.assertEquals(class1, class2)
		Assert.assertEquals(map1, map2)
		Assert.assertEquals(set1, set2)
	 */
	

	@Test
	private void assertEqualsMethod() {
		
		
		String value1 ="java";
		String value2 ="java";
		System.out.println("Report.info : Actual : "+value1+" Expected : "+value2);
		Assert.assertEquals(value1, value2, "** Actual and Expected values MisMatch **");
		System.out.println("Report.pass");

	}
	@Test
	private void assertNotEqualsMethod() {
		
		String value1 ="selenium";
		String value2 ="java";
		System.out.println("Report.info : Actual : "+value1+" Expected : "+value2);
		Assert.assertNotEquals(value1, value2, "** Actual and Expected values MisMatch **");
		System.out.println("Report.pass");

	}
	@Test
	private void assertTrueMethod() {
		
//		boolean result=element.isenabled();
		boolean result=false;
		Assert.assertTrue(result, "login not clicked");
		System.out.println("Report.pass");

	}
	
	@Test
	private void assertFalseMethod() {
		
//		boolean result=element.isenabled();
		boolean result=true;
		Assert.assertFalse(result, "login not clicked");
		System.out.println("Report.pass");

	}
	
	@Test
	private void assertNullMethod() {
		String value =null;
		Assert.assertNull(value,"value not null");
		System.out.println("Report.pass");

	}
	
	@Test
	private void assertNotNullMethod() {
		String value ="java";
		Assert.assertNotNull(value,"value null");
		System.out.println("Report.pass");

	}
	
	@Test
	private void assertFailMethod() {
		try {
			String value ="java";
			Assert.fail("voluntarly fail the test due to some reason");
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

}
