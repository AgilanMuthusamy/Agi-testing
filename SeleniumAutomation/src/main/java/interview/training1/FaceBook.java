package interview.training1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("agi");
		driver.findElement(By.name("lastname")).sendKeys("M");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("456789");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("agilan");
		WebElement findElement = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dropDown = new Select(findElement);
		dropDown.selectByVisibleText("30");
		WebElement findElement1 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select dropDown1 = new Select(findElement1);
		dropDown1.selectByIndex(7);
		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select dropDown2 = new Select(findElement2);
		dropDown2.selectByValue("1996");
		driver.findElement(By.xpath("//input[@name='sex'][1]")).click();

	}

}
