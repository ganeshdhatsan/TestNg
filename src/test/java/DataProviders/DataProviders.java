package DataProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	
	/*
	 * DataProvider : Purpose: Supplies multiple sets of test data for test methods,
	 * allowing data-driven testing.
	 * 
	 * Usage: Defined directly in the test class or in another class. It is a method
	 * that returns an array of data sets, each of which is used as input for a test
	 * method.
	 * 
	 * Scope: Best for dynamic or multi-set data, particularly when you need
	 * multiple sets of inputs to test with.
	 */
	
	
	/*
	 * Parameters : Purpose: Primarily used for passing parameters to test methods
	 * through the TestNG XML file.
	 * 
	 * Usage: Defined in the testng.xml file and associated with the test method by
	 * using @Parameters.
	 * 
	 * Scope: Best for static and single-set parameters that don’t change
	 * frequently. You can define parameters at the suite or test level in the XML
	 * file, making them accessible across multiple test methods.
	 */
	
	
	//type-01
	@Test(dataProvider="login_data_01")
	public void login_Facebook(String user, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	@DataProvider(name="login_data_01")
	private Object[][] login_Info() {
		
		return new Object[][] {
			
			{"java","s"},
			{"selenium","se"},
			{"cucumber","sel"}
			
		};
		
	}
	
	//type-02
	@Test(dataProvider="login_Info_01")
	public void login_Facebook_01(String user, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	@DataProvider
	private Object[][] login_Info_01() {
		
		return new Object[][] {
			
			{"ennavachumKodu","s"},
			{"edhachumkoduppom","se"},
			{"edhachumkoduthuthola","sel"}
			
		};
		
	}
	
//	type-03
	
	@Test(dataProvider="login_data_03",dataProviderClass=DataProviderInputClass.class)
	public void login_Facebook_03(String user, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
//	type-04
	
	@Test(dataProvider="login_Info_04",dataProviderClass=DataProviderInputClass.class)
	public void login_Facebook_04(String user, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
//loginInfoProvider
	
	@Test(dataProvider="loginInfoProvider",dataProviderClass=DataProviderInputClass.class)
	public void login_Facebook_05(String user) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
//		driver.findElement(By.id("pass")).sendKeys(user);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	//pass data from excel
	@Test(dataProvider="LoginInfoFromWorkbook",dataProviderClass=DataProviderInputClass.class)
	public void login_Facebook_FromExcel(String user, String password) throws InterruptedException {
		/**
		 * Sendkeys supports only string values if we are trying to pass ant other value , will throw below exception
		 * java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
}
