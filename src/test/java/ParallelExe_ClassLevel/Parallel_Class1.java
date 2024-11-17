package ParallelExe_ClassLevel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Parallel_Class1 {
	
//who initiate the execution called thread
	
//	public static void main(String[] args) { //main -thread
//		System.out.println("JVM main");
//	}
//
//	public static void main(String[] args,int a) { // main method
//		System.out.println(" main 1");
//	}
//
//	public static void main(String[] args,char c) {
//		System.out.println(" main 2");
//	}
//
//	public static void main(int a,String[] args) {
//		System.out.println(" main 3");
//	}
//	
//	private void mi() {
//		
//	}
	
	
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
