package Listeners_IRetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzer_Implementation implements IRetryAnalyzer {
	
	int minimum =0;
	int maximum =5;
	
	@Override
	public boolean retry(ITestResult result) {
  
		if(minimum<maximum) {
			minimum ++;
			return true;
		}

		return false;
	}
	

}
