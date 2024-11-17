package ParallelExe_MethodLevel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Parallel_Methods {
	
//who initiate the execution called thread
	
	/*
	 * public static void main(String[] args) { //main -thread
	 * System.out.println("JVM main"); }
	 * 
	 * public static void main(String[] args,int a) { // main method
	 * System.out.println(" main 1"); }
	 * 
	 * public static void main(String[] args,char c) {
	 * System.out.println(" main 2"); }
	 * 
	 * public static void main(int a,String[] args) { System.out.println(" main 3");
	 * }
	 * 
	 * private void mi() {
	 * 
	 * }
	 */
	
	/*
	 * <suite name="Suite" thread-count="2" parallel="methods"> 
	 * <test name="Test">
	 * <classes> 
	 * <class name="ParallelExe_MethodLevel.Parallel_Methods"/> 
	 * </classes>
	 * </test> 
	 * </suite>
	 */
	
	/*
	 * <suite name="Suite"> 
	 * <test name="Test"  thread-count="2" parallel="classes">
	 * <classes> 
	 * <class name="ParallelExe_MethodLevel.Parallel_Methods"/> 
	 * </classes>
	 * </test> 
	 * </suite>
	 */
	
	/*
	 * <suite name="Suite" > 
	 * <test name="Test1" thread-count="2" parallel="tests">
	 * <classes> 
	 * <class name="ParallelExe_MethodLevel.Parallel_Methods"/> 
	 * </classes>
	 * </test>
	 * <test name="Test2">
	 * <classes> 
	 * <class name="ParallelExe_MethodLevel.Parallel_Methods"/> 
	 * </classes>
	 * </test>
	 *  * <test name="Test3">
	 * <classes> 
	 * <class name="ParallelExe_MethodLevel.Parallel_Methods"/> 
	 * </classes>
	 * </test>
	 *  </suite>
	 */
	
	/*
	 * <suite name="Suite" thread-count="2" parallel="methods"> 
	 * <test name="Test" thread-count="2" parallel="methods">
	 * <classes> 
	 * <class name="ParallelExe_MethodLevel.Parallel_Methods"/> 
	 * </classes>
	 * </test> 
	 * </suite>
	 */
	
	
	
	WebDriver driver;

	@Test()
	public void testChrome() throws InterruptedException {
		System.out.println("Chrome thread ID is "+Thread.currentThread().threadId());
	driver = new ChromeDriver();
	
	}

	@Test()
	public void testFirefox() throws InterruptedException {
	System.out.println("Edge thread ID is "+ Thread.currentThread().threadId());
	driver = new EdgeDriver();
	
	}


	
}
