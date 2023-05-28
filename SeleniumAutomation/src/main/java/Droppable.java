import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement findElement = driver.findElement(By.xpath("//div[@class='demo-list']/following-sibling::iframe"));
		driver.switchTo().frame("iframe");
		WebElement findElement2 = driver.findElement(By.id("draggable"));

		Actions builder = new Actions(driver);
		WebElement findElement3 = driver.findElement(By.id("droppable"));
		builder.dragAndDrop(findElement2, findElement3).perform();
	}

}
