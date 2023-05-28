package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class CreateLeadPage  extends ProjectSpecificMethods {
	
	public CreateLeadPage (ChromeDriver driver) {
		this.driver = driver;
	}
//	public CreateLeadPage () {
//		
//	}
public CreateLeadPage enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;

	}
	
	public CreateLeadPage enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}
	public CreateLeadPage enterCompany(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		
		return this;
	}
	public ViewLeadPage clickCreateLead() {
		driver.findElement(By.xpath(prop.getProperty("CreateLead_CreateLead"))).click();
		return new ViewLeadPage(driver);

	}
}
