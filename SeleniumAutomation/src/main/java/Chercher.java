import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chercher {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='row']//iframe)[1]"));
		driver.switchTo().frame(findElement);
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Not a friendly topic");
		WebElement findElement2 = driver.findElement(By.id("frame3"));
		driver.switchTo().frame(findElement2);
		driver.findElement(By.id("a")).click();
		driver.switchTo().defaultContent();
		WebElement findElement3 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(findElement3);
		WebElement findElement4 = driver.findElement(By.id("animals"));

		Select dropDown = new Select(findElement4);
		dropDown.selectByIndex(3);

	}

}
