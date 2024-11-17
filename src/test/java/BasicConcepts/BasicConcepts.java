package BasicConcepts;

import org.testng.annotations.Test;

public class BasicConcepts {

	/*
	 * @Test()-> arguments should be in camel notation
	 * 
	 * 1.Annotations & Its priority or execution flow 
	 * 2.priority = -1,0,1 (Negative,0 , Positive) 
	 * 3.invocationCount = 4.enabled =
	 * 
	 **/

	/**
	 * 1. TestNG Annotations & Its priority or execution flow
	 * 
	 * All Annotations should be in pascal notation
	 * 
	 * @BeforeSuite -- Only One Time Execution
	 * @BeforeTest
	 * @BeforeClass
	 * @BeforeMethod
	 * @Test
	 * @AfterMethod
	 * @AfterClass
	 * @AfterTest
	 * @AfterSuit
	 * 
	 */

	/**
	 * TestNg XML Basic Structure 
	 * 
	 * <suite name=""> 
	 * <test name =""> 
	 * <classes>
	 * <class name ="com.pack.ClassA"/> 
	 * <class name ="com.pack.ClassB"/>
	 *  </classes>
	 * </test> 
	 * </suite>
	 */
	
	/**
	 * <suite name="mainSuite">
  <test thread-count="5" name="Test1">
    <classes>
      <class name="BasicConcepts.ClassB"/>
      <class name="BasicConcepts.ClassA"/>
    </classes>
  </test> <!-- Test -->
  <test thread-count="5" name="Test2">
    <classes>
      <class name="BasicConcepts.ClassC"/>
      <class name="BasicConcepts.ClassD"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
	 */
	
	/**
	 * No Access Modifier & Specifier except Abstract restriction , we can use anything like private , public
	 * WE can't take any return, if we are trying to take will show No test found
	 * we can use arguments but only with TestNg parameters else will throw TestNG Excepetion
	 */
	
	@Test()
	 private void method() {
		System.out.println("TestNg");

	}

}
