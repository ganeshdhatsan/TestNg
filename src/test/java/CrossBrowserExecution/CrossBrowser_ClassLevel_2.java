package CrossBrowserExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_ClassLevel_2 {
	
//	<?xml version="1.0" encoding="UTF-8"?>
//	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//	<suite name="Suite" thread-count="5" parallel="classes">
//	  <test  name="Test">
//		  <parameter name="browser" value="chrome"></parameter>
//	    <classes>
//	      <class name="CrossBrowserExecution.CrossBrowser_ClassLevel_1"/>
//	      <class name="CrossBrowserExecution.CrossBrowser_ClassLevel_2"/>
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
