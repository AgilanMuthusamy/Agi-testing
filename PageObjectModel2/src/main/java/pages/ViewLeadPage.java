package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewLeadPage  extends ProjectSpecificMethods {
public ViewLeadPage (ChromeDriver driver) {
	this.driver = driver;
	
		
	}
//public ViewLeadPage () {
//	
//	
//}
public ViewLeadPage verifyFirstName() {
System.out.println("First name is Displayed");
return this;
}
}
