package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods{
	@BeforeTest
	public void setValue() {
		excelFileName = "login";

	}
	@Test(dataProvider="provideData")
	public void runVerifyLogin(String username,String password) {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(username).enterPassword(password).ClickLoginButton().verifyHomePage();
		
		
		
	}

}
