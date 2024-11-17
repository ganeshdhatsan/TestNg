package BasicConcepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class Enabled {
	
	/**
	 * when we want to avoid some tests from test execution 
	 * we can use like 	@Test(enabled=false)
	 * we can pass true / false
	 * default value is true
	 * 
	 * 
	 * @ignore can be used for method level & class level
	 * 
	 * enabled can be used in method level & xml level
	 */

	@Ignore
	@Test()
	public void getTitle() {
	}

	@Test(enabled=false)
	public void closeBrowser() {
	}

	@Test()
	public void clasic() {
	}

}
