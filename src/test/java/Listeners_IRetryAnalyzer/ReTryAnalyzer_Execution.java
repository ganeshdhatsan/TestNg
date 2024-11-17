package Listeners_IRetryAnalyzer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReTryAnalyzer_Execution {

	WebDriver driver;

	@Test(retryAnalyzer = IRetryAnalyzer_Implementation.class)
	public void testExample() {
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
		options.addArguments("--incognito");
		options.addArguments("--start-maximized"); 
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("java");
		driver.findElement(By.id("pass")).sendKeys("selenium");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}

}
