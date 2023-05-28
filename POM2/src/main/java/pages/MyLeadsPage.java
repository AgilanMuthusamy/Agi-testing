package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText(prop.getProperty("MyLeads_CreateLead"))).click();
		return new CreateLeadPage();
	}

}
