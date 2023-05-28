package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods{
	@BeforeTest
	public void setValue() {
		testName = "VerifyLogin";
		testDescription = "Login with positive data";
		testCategory = "Smoke";
		testAuthor = "Agi";
		excelFileName = "login";

	}
	@Test(dataProvider="provideData")
	public void runVerifyLogin(String username,String password) throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(username).enterPassword(password).ClickLoginButton().verifyHomePage();
		
		
		
	}

}
