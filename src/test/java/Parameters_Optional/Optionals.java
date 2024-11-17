package Parameters_Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Optionals {
	
	
//	ENV:
//		DEV_ENV:dev1
//		TST_ENV:tst1
//		UAT_ENV:uat1
//		PROD_ENV:prod1
	
//	<?xml version="1.0" encoding="UTF-8"?>
//	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//	<suite name="Suite">
//	  <test thread-count="5" name="Test">
//	    <classes>
//	      <class name="Parameters_Optional.Option"/>
//	    </classes>
//	  </test> <!-- Test -->
//	</suite> <!-- Suite -->
	
	@Parameters({"user","password"})
	@Test
	public void login_Facebook(@Optional("tst1")String user ,@Optional("tstpass")String password) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		driver.quit();
	}

}
