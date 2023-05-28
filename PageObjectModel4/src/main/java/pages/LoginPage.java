package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
public LoginPage (ChromeDriver driver) {
	this.driver = driver;
		
	}
//public LoginPage () {
//	 
//}
	//action+elementName
public LoginPage enterUsername(String username) throws IOException {
	try {
		driver.findElement(By.id("username")).sendKeys(username);
		reportStep(username+"Username is entered successfully","pass");
	} catch (Exception e) {
		reportStep(e+"Username is not entered successfully","fail");
	}
	return this;
	
	
}
public LoginPage enterPassword(String password) throws IOException {
	try {
		driver.findElement(By.id("password")).sendKeys(password);
		reportStep(password+" Password is entered successfully","pass");
	} catch (Exception e) {
		reportStep(e+" Password is not entered successfully","fail");
	}
	return this;
}
public HomePage ClickLoginButton() throws IOException {
	try {
		driver.findElement(By.className("decorativeSubmit")).click();
		reportStep(" LoginButton is entered successfully","pass");
	} catch (Exception e) {
		reportStep(e+" LoginButton is not entered successfully","fail");
	}
//	HomePage hp = new HomePage();
	return new HomePage(driver);
}

}
