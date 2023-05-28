package interview.training1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("agilan");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("agilan.msamy@gmail.com");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Amazon");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("96293766573");
		WebElement option1 = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select dropDown1 = new Select(option1);
		dropDown1.selectByValue("IT_Manager_AP");
		WebElement option2 = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select dropDown2 = new Select(option2);
		dropDown2.selectByIndex(4);
		WebElement option3 = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select dropDown3 = new Select(option3);
		dropDown3.selectByValue("IN");
//		driver.findElement(By.xpath("//input[@name='SubscriptionAgreement']/following-sibling::div[1]")).click();
		driver.close();
	}

}
