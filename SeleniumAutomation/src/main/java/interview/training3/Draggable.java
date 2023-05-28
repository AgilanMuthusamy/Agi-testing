package interview.training3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draggable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class = 'demo-frame']"));
//		driver.switchTo().frame(frame);
//		WebElement drag = driver.findElement(By.id("draggable"));
//
//		Actions builder = new Actions(driver);
//		builder.dragAndDropBy(drag, 200, 150).perform();
		WebElement findElement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(findElement);
		WebElement findElement2 = driver.findElement(By.id("draggable"));
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(findElement2, 100, 90).perform();
	}

}
