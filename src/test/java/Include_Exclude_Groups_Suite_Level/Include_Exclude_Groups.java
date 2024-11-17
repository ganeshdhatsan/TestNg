package Include_Exclude_Groups_Suite_Level;

import org.testng.annotations.Test;

public class Include_Exclude_Groups {

	/**
	 * <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
	 * <suite name="Suite"> 
	 * <test name="Test"> 
	 * <groups> 
	 * <run>
	 * <include name="smoke"/>
	 * <exclude name="regression"/> 
	 * </run> 
	 * </groups>
	 * <classes>
	 * <class name="GroupTest"/> 
	 * </classes> 
	 * </test> 
	 * </suite>
	 * 
	 */

	@Test(groups = {"smoke"})
	private void login() {
		System.out.println("login --@smoke");
	}

	@Test(groups = { "@sanity", "@regression" })
	private void forgetPassword() {
		System.out.println("forgetPassword --@sanity,@regression");
	}

	@Test(groups = { "@smoke", "@regression", "@sanity" })
	private void search() {
		System.out.println("search --@smoke,@regression,@sanity");
	}

	@Test(groups = { "@smoke", "@regression", "@sanity" })
	private void addToCart() {
		System.out.println("addToCart --@smoke,@regression,@sanity");
	}

	@Test(groups = { "@sanity", "@regression" })
	private void verifyProducts() {
		System.out.println("verifyProducts --@sanity,@regression");
	}

	@Test(groups = { "@sanity", "@regression" })
	private void checkOut() {
		System.out.println("checkOut --@sanity,@regression");
	}

	@Test(groups = { "@sanity", "@regression" })
	private void address() {
		System.out.println("address --@sanity,@regression");
	}

	@Test(groups = { "@sanity", "@regression" })
	private void payment() {
		System.out.println("payment --@sanity,@regression");
	}

	@Test(groups = { "@regression" })
	private void proceed() {
		System.out.println("proceed --@regression");
	}

}
