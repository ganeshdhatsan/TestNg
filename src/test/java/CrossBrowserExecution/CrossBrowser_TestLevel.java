package CrossBrowserExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_TestLevel {
	
//	<?xml version="1.0" encoding="UTF-8"?>
//	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//	<suite name="Suite" thread-count="5" parallel="tests">
//	  <test  name="Test1">
//		  <parameter name="browser" value="chrome"></parameter>
//	    <classes>
//	      <class name="CrossBrowserExecution.CrossBrowser"/>
//	    </classes>
//	  </test> <!-- Test -->
//	  <test  name="Test2">
//		  <parameter name="browser" value="edge"></parameter>
//	    <classes>
//	      <class name="CrossBrowserExecution.CrossBrowser"/>
//	    </classes>
//	  </test> <!-- Test -->
//	</suite> <!-- Suite -->
//	
	WebDriver driver;

	@Parameters({ "browser" })
	@Test
	public void browserLaunch(String browser) throws InterruptedException {

		switch (browser.toUpperCase()) {
		case "CHROME":
			System.out.println("chrome browser");
			driver = new ChromeDriver();
			break;
		case "EDGE":
			System.out.println("edge browser");
			driver = new EdgeDriver();
			break;
		default:
			break;

		}
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");

	}
	

}
