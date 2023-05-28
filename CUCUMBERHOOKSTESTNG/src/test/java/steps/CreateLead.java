package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {



@When("Click on {string} link")
public void clicKCRMSFA(String partialText) {
	// TODO Auto-generated method stub
	driver.findElement(By.linkText(partialText)).click();

}

@Then("{string} page should be displayed")
public void verifyPage(String partialText) {

	boolean displayed = driver.findElement(By.xpath("//div[contains(text(),'" + partialText + "')]")).isDisplayed();
//	if (displayed) {
//		System.out.println(partialText + " is displayed");
//
//	} else {
//		System.out.println(partialText + " is not displayed");
//
//	}
//	
	Assert.assertTrue(displayed);
	System.out.println(partialText + " is displayed");
	
}
}
