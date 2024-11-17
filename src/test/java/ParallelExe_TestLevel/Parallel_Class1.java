package ParallelExe_TestLevel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Parallel_Class1 {
	
	
	
	WebDriver driver;

	@Test()
	public void testChrome() throws InterruptedException {
		System.out.println("Class1_Chrome thread ID is "+Thread.currentThread().threadId());
	driver = new ChromeDriver();
	Thread.sleep(2000);
	driver.close();
	
	}

	@Test()
	public void testFirefox() throws InterruptedException {
	System.out.println("Class1_Edge thread ID is "+ Thread.currentThread().threadId());
	driver = new EdgeDriver();
	driver.close();
	}

	
}
