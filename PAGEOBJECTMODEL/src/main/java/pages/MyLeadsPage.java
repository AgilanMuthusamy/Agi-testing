package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class MyLeadsPage  extends ProjectSpecificMethods{
public MyLeadsPage (RemoteWebDriver driver) {
	this.driver = driver;
		
	}
//public MyLeadsPage () {
//	
//}
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage (driver);
	}

}
