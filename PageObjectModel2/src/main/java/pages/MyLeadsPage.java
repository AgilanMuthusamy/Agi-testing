package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyLeadsPage  extends ProjectSpecificMethods{
public MyLeadsPage (ChromeDriver driver) {
	this.driver = driver;
		
	}
//public MyLeadsPage () {
//	
//}
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText(prop.getProperty("MyLeads_CreateLead"))).click();
		return new CreateLeadPage (driver);
	}

}
