package Listeners_ITestListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExecutionClass_ITestListener {
	
	/**
	 * step 01: Create a class and Implement ITestListener Interface
	 * step 02: Create Execution class
	 * step 03: Convert Execution class to XML
	 * step 04:
	 * <?xml version="1.0" encoding="UTF-8"?>
       <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
       <suite name="Suite">
	   <listeners>
	   <listener class-name="Listeners_ITestListener.ITestListener_Implementation"></listener>
	   </listeners>
       <test thread-count="5" name="Test">
       <classes>
       <class name="Listeners_ITestListener.ExecutionClass_ITestListener"/>
       </classes>
       </test> <!-- Test -->
       </suite> <!-- Suite -->
	 */

	WebDriver driver;
	
	@BeforeSuite
	private void beforeSuit() {
		System.out.println("beforeSuit");
	}

	@BeforeClass
	private void beforeClass() {
		System.out.println("beforeClass");
	}

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("beforeMethod");

	}

	@Test
	private void test1() {
		System.out.println("test1");
		System.out.println("test1_pass");
	}

	@Test
	private void test2() {
		System.out.println("test2");
		System.out.println("test2_fail");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("java");
		driver.findElement(By.id("pas")).sendKeys("selenium");
		driver.findElement(By.name("login")).click();
		driver.quit();
//		Assert.fail("It shoud fail");
		
	}

	@Test(dependsOnMethods="test2")
	private void test3() {
		System.out.println("test3");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("afterMethod");
	}

	@AfterClass
	private void afterClass() {
		System.out.println("afterClass");
	}

	@AfterSuite
	private void afterSuit() {
		System.out.println("afterSuit");
	}
}
