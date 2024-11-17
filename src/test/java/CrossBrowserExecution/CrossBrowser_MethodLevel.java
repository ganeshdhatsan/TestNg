package CrossBrowserExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_MethodLevel {
	WebDriver driver;

	@Parameters({ "browser" })
	@Test
	public void browserLaunch_1(String browser) throws InterruptedException {

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
	
	@Parameters({ "browser" })
	@Test
	public void browserLaunch_2(String browser) throws InterruptedException {

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
