package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText(prop.getProperty("MyHome_Leads"))).click();
		return new MyLeadsPage();
	}

}
