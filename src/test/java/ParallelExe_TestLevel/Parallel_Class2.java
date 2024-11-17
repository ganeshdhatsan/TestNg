package ParallelExe_TestLevel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Parallel_Class2 {

	
	
	WebDriver driver;

	@Test()
	public void testChrome() throws InterruptedException {
		System.out.println("Class2_Chrome thread ID is "+Thread.currentThread().threadId());
	driver = new ChromeDriver();
	driver.close();
	}

	@Test()
	public void testFirefox() throws InterruptedException {
	System.out.println("Class2_Edge thread ID is "+ Thread.currentThread().threadId());
	driver = new EdgeDriver();
	driver.close();
	
	}

	
}
