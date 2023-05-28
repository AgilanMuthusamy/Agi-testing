package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseClass;

public class LoginPage extends BaseClass {
	
	
	public LoginPage enterUsername(String username) throws IOException {
		try {
			driver.findElement(By.id("username")).sendKeys(username);//"DemoSalesManager"
			reportStep("username is entered successfully", "pass");
		} catch (Exception e) {
			reportStep(e+"username is not entered successfully", "fail");
		}
		return this;
		
		
	}
	public LoginPage enterPassword(String password) throws IOException {
		try {
			driver.findElement(By.id("password")).sendKeys(password);//"crmsfa"
			reportStep("password is entered successfully", "pass");

		} catch (Exception e) {
			reportStep(e+"password is not entered successfully", "fail");
		}
		return this;
	
	
	}
	public HomePage clickLoginButton() throws IOException {
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
			reportStep("loginButton is clicked successfully", "pass");

		} catch (Exception e) {
			reportStep(e+"loginButton is not clicked successfully", "fail");		}
		return new HomePage();

	}
}
