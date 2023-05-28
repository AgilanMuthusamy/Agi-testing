package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownClasssRoom {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		WebElement eleusername = driver.findElement(By.id("password"));
		eleusername.sendKeys("crmsfa");
		WebElement submit = driver.findElement(By.className("decorativeSubmit"));
		submit.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement elesource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(elesource);
		dropdown.selectByVisibleText("Direct Mail");
		WebElement eleindustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown1 = new Select(eleindustry);
		dropdown1.selectByIndex(7);
		WebElement eleownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown2 = new Select(eleownership);
		dropdown2.selectByValue("OWN_PARTNERSHIP");
		
		
	}

}
