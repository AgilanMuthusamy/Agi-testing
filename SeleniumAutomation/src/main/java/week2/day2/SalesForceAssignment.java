package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceAssignment {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Rajnikanth");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("SUPERSTAR");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("agilan.msmay@gmail.com");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Amazon");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9629376573");
		WebElement number1 = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select dropdown = new Select(number1);
		dropdown.selectByValue("IT_Manager_AP");
		WebElement number2 = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select dropdown1 = new Select(number2);
		dropdown1.selectByIndex(4);
		WebElement number3 = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select dropdown2 = new Select(number3);
		dropdown2.selectByVisibleText("IN");
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling: :div[1]")).click();
		driver.close();

	}

}
