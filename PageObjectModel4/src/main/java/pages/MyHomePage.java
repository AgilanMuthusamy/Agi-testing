package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyHomePage  extends ProjectSpecificMethods {
public MyHomePage (ChromeDriver driver) {
	this.driver = driver;
		
	}
//public MyHomePage () {
//	
//}
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText(prop.getProperty("MyHome_Leads"))).click();
		return new MyLeadsPage(driver);
		// TODO Auto-generated method stub

	}

}
