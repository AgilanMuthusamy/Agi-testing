package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
import utils.RetryFailedTests;

public class CreateLead extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValue() {
		excelFileName = "CreateLead";

	}
	
	@Test(dataProvider="provideData"  /*, retryAnalyzer = RetryFailedTests.class  */)
	public void runCreateLead(String username,String password, String company,String firstName ,String lastName) {

	LoginPage lp = new LoginPage(driver);
	lp.enterUsername(username).enterPassword(password)
	.ClickLoginButton().clickcrmsfaLink().clickLeads()
	.clickCreateLead().enterCompany(company).enterFirstName(firstName).enterLastName(lastName);
		
	}

}
