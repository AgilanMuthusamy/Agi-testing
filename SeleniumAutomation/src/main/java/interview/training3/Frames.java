package interview.training3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='row']//iframe)[1]"));
		driver.switchTo().frame(findElement);
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("not a friendly topic");
		WebElement findElement2 = driver.findElement(By.id("frame3"));
		driver.switchTo().frame(findElement2);
		driver.findElement(By.id("a")).click();
		driver.switchTo().defaultContent();
		WebElement findElement3 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(findElement3);
		WebElement findElement4 = driver.findElement(By.id("animals"));
		Select dropDown = new Select(findElement4);
		dropDown.selectByIndex(2);

	}

}
