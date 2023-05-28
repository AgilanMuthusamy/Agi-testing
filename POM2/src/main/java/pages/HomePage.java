package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseClass;

public class HomePage extends BaseClass {
	
	
	public HomePage verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}
	public MyHomePage clickCRMSFAlink() {
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 return new MyHomePage();
	}
	

}