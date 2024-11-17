package ParallelExe_ThreadLocal;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class InitBrowser {

    private static InitBrowser initBrowser;

    // Private constructor to prevent instantiation
    private InitBrowser() {}

    // Lazy-loaded and thread-safe singleton instance
    public static synchronized InitBrowser getInstance() {
        if (initBrowser == null) {
            initBrowser = new InitBrowser();
        }
        return initBrowser;
    }

    // ThreadLocal WebDriver for parallel execution
    private ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public void setDriver(String browser) {
     
        switch(browser.toUpperCase()) {
        case "CHROME":
        	driver.set(new ChromeDriver());
        	break;
        case "EDGE":
        	driver.set(new EdgeDriver());
        	break;
        case "FIREFOX":
        	driver.set(new FirefoxDriver());
        	break;
        case "SAFARI":
        	driver.set(new SafariDriver());
        	break;
        default:
        	break;
        }
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public void closeDriver() {
        if (getDriver() != null) {
            getDriver().quit(); // Use quit() to fully close the session
            driver.remove();    // Remove the ThreadLocal value
        }
    }
}


