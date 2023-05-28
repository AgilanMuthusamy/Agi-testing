package interview.training3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		Actions builder = new Actions(driver);
		driver.get("https://jqueryui.com/selectable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement findElement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(findElement);
		WebElement element1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement element2 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		builder.clickAndHold(element1).moveToElement(element2).release().perform();
		

	}

}
