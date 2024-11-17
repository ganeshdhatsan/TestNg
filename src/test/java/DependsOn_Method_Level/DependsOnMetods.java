package DependsOn_Method_Level;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMetods {
	/**
	 * @Test(dependsOnMethods = "login")
	 * @Test(dependsOnMethods = {"login","search","addToCart"})
	 */

	@Test(priority=1)
	private void login() {
		System.out.println("login ");
		Assert.fail("login failed");

	}

//	@Test(dependsOnMethods = "login")
//	private void search() {
//		System.out.println("search ");
//	}
	
	@Test(priority=2)
	private void search() {
		System.out.println("search ");
	}
	
	@Test(priority=3)
	private void addToCart() {
		System.out.println("addToCart ");
	}
	
	@Test(priority=4,dependsOnMethods = {"login","search","addToCart"})
	private void checkOut() {
		System.out.println("checkOut ");
	}

}
