package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	
	public LoginPage enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);//"DemoSalesManager"
		return this;
		
		
	}
	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);//"crmsfa"
		return this;
	
	
	}
	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage();

	}
}
