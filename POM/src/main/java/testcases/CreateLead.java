package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void setValue() {
		excelFileName="CreateLead";
	}
	
	@Test(dataProvider="provideData")
	public void runCreateLead(String username,String password, String firstName ,String lastName,String company) {
		LoginPage lp = new LoginPage();
		
lp.enterUsername(username).enterPassword(password).clickLoginButton().clickCRMSFAlink().clickLeads().clickCreateLead().enterFirstName(firstName).enterLastName(lastName).enterCompany(company);

	}

}
