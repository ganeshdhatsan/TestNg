package Listeners_IAnnotationTransformer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Listeners_IRetryAnalyzer.IRetryAnalyzer_Implementation;

public class IAnnotationTransformer_Execution {

	WebDriver driver;

	@Test()
	public void testExample1() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("java");
		driver.findElement(By.id("pas")).sendKeys("selenium");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}
	
	@Test()
	public void testExample2() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("java");
		driver.findElement(By.id("pass")).sendKeys("selenium");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}

	
	
}
