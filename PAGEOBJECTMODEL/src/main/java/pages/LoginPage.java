package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
public LoginPage (RemoteWebDriver driver) {
	this.driver = driver;
		
	}
//public LoginPage () {
//	
//}
	//action+elementName
public LoginPage enterUsername(String username) {
	driver.findElement(By.id("username")).sendKeys(username);//"DemoSalesManager"
	return this;
	
	
}
public LoginPage enterPassword(String password) {
	driver.findElement(By.id("password")).sendKeys(password);//"crmsfa"
	return this;
}
public HomePage ClickLoginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
//	HomePage hp = new HomePage();
	return new HomePage(driver);
}

}
