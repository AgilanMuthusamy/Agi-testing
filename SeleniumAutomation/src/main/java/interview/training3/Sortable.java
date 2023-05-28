package interview.training3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		Actions builder = new Actions(driver);
		driver.get("https://jqueryui.com/sortable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element1 = driver.findElement(By.xpath("//div[@class='demo-list']/following-sibling::iframe"));
		driver.switchTo().frame(element1);
		WebElement element = driver.findElement(By.xpath("(//ul[@id='sortable']/li)[1]"));
		Point location = driver.findElement(By.xpath("(//ul[@id='sortable']/li)[5]")).getLocation();
		int x = location.getX();
		int y = location.getY();
		builder.clickAndHold(element).moveByOffset(x, y).release().perform();

	}

}
