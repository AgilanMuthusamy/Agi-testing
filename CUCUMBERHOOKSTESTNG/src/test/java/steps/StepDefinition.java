package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	@Given("Enter username as {string}")
	public void enter_username_as_demosalesmanager(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@And("Enter password as {string}")
	public void enter_password_as_crmsfa(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage should be displyed")
	public void homepage_should_be_displyed() {
//		String title = driver.getTitle();
//		if (title.equals("Leaftaps - TestLeaf Automation Platform")) {
//			System.out.println("homepgae");
//		} else {
//			System.out.println("nothomepage");
//
//		}
		String actTitle = driver.getTitle();
		String expTitle =	"Leaftaps - TestLeaf Automation Platform";
		Assert.assertEquals(actTitle, expTitle);

	}
	}

