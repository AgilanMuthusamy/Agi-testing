package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer{
	int count=1,maxRetry=2;
	public boolean retry(ITestResult result) {
		
		
		
		if (count<maxRetry) {
			count++;
			return true;
			
		}
		
		
		
		
		return false;
	}

}
