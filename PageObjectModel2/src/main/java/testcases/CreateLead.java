package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods {

	@BeforeTest
	public void setValue() {
		excelFileName = "CreateLead";

	} 

	@Test(dataProvider = "provideData")
	public void runCreateLead(String lang, String username, String password, String company, String firstName,
			String lastName) throws IOException {

		File file = null;
		if (lang.equalsIgnoreCase("EN")) {
			file = new File("src/main/resources/en.properties");

		} else if (lang.equalsIgnoreCase("FR")) {
			file = new File("src/main/resources/fr.properties");

		}

		FileInputStream fs = new FileInputStream(file);

		prop.load(fs);

		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(username).enterPassword(password).ClickLoginButton().clickcrmsfaLink().clickLeads()
				.clickCreateLead().enterCompany(company).enterFirstName(firstName).enterLastName(lastName);

	}

}
