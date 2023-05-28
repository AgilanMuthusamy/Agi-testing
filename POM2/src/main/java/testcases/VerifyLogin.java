package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyLogin extends BaseClass {
	@BeforeTest
	public void setValue() {
		excelFileName ="login";
	}
	
	
	@Test(dataProvider="provideData")
	public void runVerifyLogin(String Username,String password) {
		
		LoginPage lp = new LoginPage();
		lp.enterUsername(Username).enterPassword(password).clickLoginButton().verifyHomePage();

	}

}
