package interview.training1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Demosalesmanager");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[@for = 'crmsfa']/a")).click();
		driver.findElement(By.linkText("Contacts")).click();

		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("agi");
		driver.findElement(By.id("lastNameField")).sendKeys("M");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("AGI");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("M");
		driver.findElement(By.name("departmentName")).sendKeys("Selenium");
		driver.findElement(By.name("description")).sendKeys("Learn Selenium");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("agi@gmail.com");
		WebElement findElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropDown = new Select(findElement);
		dropDown.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("updated");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println("The Title is : " + driver.getTitle());

	}

}
