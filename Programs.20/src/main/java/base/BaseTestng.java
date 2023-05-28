package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestng {

	long startTime;
	long endTime;
	int letter, space, num, specialChar;
	long value;

	@BeforeMethod
	public void startTimer() {
		letter = 0;
		space = 0;
		num = 0;
		specialChar = 0;
		startTime = System.nanoTime();
	}

	@AfterMethod
	public   void endTimer() {
		endTime = System.nanoTime();
		value= endTime-startTime;
		System.out.println(endTime - startTime);
	}
}
