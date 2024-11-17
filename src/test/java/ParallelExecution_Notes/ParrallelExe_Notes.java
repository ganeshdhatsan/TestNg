package ParallelExecution_Notes;

public class ParrallelExe_Notes {

	/**
	 * TestNG, parallel execution used to run test methods, test classes, or suites concurrently(simultaneously). 
	 * 1.test level
	 * 2.class level
	 * 3.method level
	 * 
	 * This can significantly reduce the total execution time of your tests.
	 * Purpose:
	 * 1).Testing large number of test cases,
	 * 2).Testing across multiple browsers, environments, or devices
	 */

	/**
	 * Configuration: 
	 * <!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
	 * <suite name="SuiteName" parallel="methods" thread-count="5">
	 * <test name="Test1"> 
	 * <classes> 
	 * <class name="com.example.TestClass1" />
	 * </classes> 
	 * </test>
	 * <test name="Test2">
	 * <classes> 
	 * <class name="com.example.TestClass2" />
	 * </classes> 
	 * </test> 
	 * </suite>
	 * 
	 */
	
}
