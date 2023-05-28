package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class MyHomePage  extends ProjectSpecificMethods {
public MyHomePage (RemoteWebDriver driver) {
	this.driver = driver;
		
	}
//public MyHomePage () {
//	
//}
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
		// TODO Auto-generated method stub

	}

}
