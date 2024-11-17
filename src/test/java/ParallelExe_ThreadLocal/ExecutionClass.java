package ParallelExe_ThreadLocal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ExecutionClass {
	WebDriver driver;
	@Test
	public void browserLaunch_1() {
		InitBrowser.getInstance().setDriver("chrome");
		driver = InitBrowser.getInstance().getDriver();
		System.out.println("chrome thread  "+Thread.currentThread().getId());
		driver.get("https://www.facebook.com/");

	}
	@Test
	public void browserLaunch_2() {
		InitBrowser.getInstance().setDriver("edge");
		driver = InitBrowser.getInstance().getDriver();
		System.out.println("edge thread  "+Thread.currentThread().getId());
		driver.get("https://www.facebook.com/");

	}
	
}
