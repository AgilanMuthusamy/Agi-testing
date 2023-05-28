package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://en-gb.facebook.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.xpath("(//form[@method='post']//a)[3]")).click();
    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("agilan");
    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("muthusamy");
    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9629376573");
    driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("AGIPASSWORD");
    WebElement number1 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
    Select dropdown=new Select(number1);
    dropdown.selectByVisibleText("30");
    WebElement number2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
    Select dropdown1 = new Select(number2);
    dropdown1.selectByIndex(6);
    WebElement number3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
    Select dropdown2 =new Select(number3);
    dropdown2.selectByValue("1996");
    driver.findElement(By.xpath("//input[@name='sex'][2]")).click();
    
    
    
    
    
  
    
    
    
    
	}

}
