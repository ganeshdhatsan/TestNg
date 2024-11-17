package Parameters_Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Concept {
	
	/*
	 * In TestNG, parameters are a powerful feature that allows you to pass values
	 * to test methods at runtime. This can help in creating flexible and reusable
	 * tests.
	 * 
	 * Purpose of Parameters in TestNG: Data-Driven Testing: Parameters enable you
	 * to run the same test method with different sets of data, which is essential
	 * for testing various scenarios.
	 * 
	 * Configuration Flexibility: You can define different configurations for your
	 * tests (like URLs, timeouts, etc.) without hardcoding them in your test
	 * scripts.
	 * 
	 * Separation of Concerns: Parameters help to keep test logic separate from the
	 * test data, making tests easier to maintain and understand.
	 * 
	 * Environment-Specific Values: You can specify different parameters for
	 * different environments (development, testing, production) through XML
	 * configuration.
	 */
	
//	<?xml version="1.0" encoding="UTF-8"?>
//	<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//	<suite name="Suite">
//	  <test thread-count="5" name="Test">
//		  <parameter name="Facebook_userName" value="java"></parameter>
//		  <parameter name="Facebook_password" value="selenium"></parameter>
//	    <classes>
//	      <class name="Parameters_Optional.Parameter_Concept"/>
//	    </classes>
//	  </test> <!-- Test -->
//	</suite> <!-- Suite -->

	
	/*
	 * Step-01 : write a script in class level using arguments or create  a parameterized method
	 * step-02 : convert that class to xml
	 * step-03 : in xml file we have to implement parameter with values
	 * step-04 : implement the @Parameter annotation in method level for the corresponding @test method
	 * Notes:
	 * xml parameter name should be match with method level @Parameter name
	 * ex:
	 * <parameter name="Facebook_userName" value="java"></parameter>
       <parameter name="Facebook_password" value="selenium"></parameter>
       @Parameter({"Facebook_userName","Facebook_password"})
	 * First value in the Parameter will automatically pass in the first value of the method
	 * The values in both no need to be same(parameter value & method arguments)
	 */
	
	@Parameters({"Facebook_userName","Facebook_password"})
	@Test
	public void login_Facebook(String user, String password) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		driver.quit();
	}

}
