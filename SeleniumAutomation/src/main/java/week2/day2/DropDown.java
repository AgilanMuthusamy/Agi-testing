package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement findElement = driver.findElement(By.id("dropdown1"));
		Select dropdown1 = new Select(findElement);
		dropdown1.selectByIndex(1);
		
		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='dropdown2'"));
	    Select dropdown2 = new Select(findElement2);
	    dropdown2.selectByVisibleText("Loadrunner");
	    
	    WebElement findElement3 = driver.findElement(By.id("dropdown3"));
	    Select dropdown3 = new Select(findElement3);
	    dropdown3.selectByValue("1");
	    
		
		
		
	}
	

}
