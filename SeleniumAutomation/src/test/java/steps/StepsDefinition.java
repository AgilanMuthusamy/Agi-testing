package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDefinition extends BaseClass {
	

/*	@Given("Open the Chrome Browser")
	public void open_the_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("Load the application url {string}")
	public void load_the_application_url(String url) {
		driver.get(url);
	}
*/
	@Given("Enter username as {string}")
	public void enter_username_as_demosalesmanager(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@Given("Enter password as {string}")
	public void enter_password_as_crmsfa(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage should be displyed")
	public void homepage_should_be_displyed() {
		String title = driver.getTitle();
		if (title.equals("Leaftaps - TestLeaf Automation Platform")) {
			System.out.println("homepgae");
		} else {
			System.out.println("nothomepage");

		}
	}

	@But("Error message should be displyed")
	public void verifyErrorMessage() {
		System.out.println("Error msg is  displayed");

	}

}
