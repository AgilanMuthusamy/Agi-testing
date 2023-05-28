package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

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
	public void runCreateLead(String lang, String username,String password, String firstName ,String lastName,String company) throws IOException {
		
		
		
		File file = null;
		if (lang.equalsIgnoreCase("EN")) {
			 file = new File("src/main/resources/en.properties");
			
		}
	if (lang.equalsIgnoreCase("FR")) {
		file = new File("src/main/resources/fr.properties");
		
	}
		
		FileInputStream fs = new FileInputStream(file);
		prop.load(fs);
		
		
		
		LoginPage lp = new LoginPage();
		
lp.enterUsername(username).enterPassword(password).clickLoginButton().clickCRMSFAlink().clickLeads().clickCreateLead().enterFirstName(firstName).enterLastName(lastName).enterCompany(company);

	}

}
