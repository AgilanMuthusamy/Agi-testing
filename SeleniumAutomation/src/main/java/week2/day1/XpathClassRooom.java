package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathClassRooom {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		WebElement eleusername = driver.findElement(By.xpath("//input[@id='password']"));
		eleusername.sendKeys("crmsfa");
		WebElement submit = driver.findElement(By.className("decorativeSubmit"));
		submit.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Agilan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muthusamy");
		driver.findElement(By.name("submitButton")).click();

	

	}

}
