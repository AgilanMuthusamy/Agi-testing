package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyLogin extends BaseClass {
	@BeforeTest
	public void setValue() {
		excelFileName ="login";
		testName="VerifyLogin";	
		testDescription="Login with positive data";
		testCategory="smoke";
		testAuthor="agi";
	}
	
	
	@Test(dataProvider="provideData")
	public void runVerifyLogin(String Username,String password) throws IOException {
		
		LoginPage lp = new LoginPage();
		lp.enterUsername(Username).enterPassword(password).clickLoginButton().verifyHomePage();

	}

}
