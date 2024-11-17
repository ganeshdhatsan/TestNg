package DependsOnGroups_Method_Level;

import org.testng.annotations.Test;

public class DependsOnGroups {

//	@Test(groups = { "init" })
//	public void initTest() {
//		System.out.println("Initialization test");
//	}
//
//	@Test(groups = { "main" }, dependsOnGroups = { "init" })
//	public void mainTest() {
//		System.out.println("Main test depends on init group");
//	}
//
//	@Test(groups = { "@smoke" })
//	private void login() {
//		System.out.println("login --@smoke");
//	}
//
//	@Test(groups = { "@regression" }, dependsOnGroups = { "@smoke" })
//	private void morgetPassword() {
//		System.out.println("forgetPassword --@regression");
//	}
	
	@Test(groups = { "smoke" })
	public void login() {
	    System.out.println("login --@smoke");
	}

	@Test(groups = { "regression" }, dependsOnGroups = { "smoke" })
	public void forgetPassword() {
	    System.out.println("forgetPassword --@regression");
	}

	

}
