package interview.training3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nyka {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https:www.nykaa.com");
		WebElement brand = driver.findElement(By.xpath("//a[text() = 'brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brand).perform();
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		String title = driver.getTitle();
		if (title.contains("L'Oreal Paris")) {
			System.out.println("title verified");

		} else {
			System.out.println("title not verified");
		}
		driver.findElement(By.xpath("//div[@id='filter-sort']//button")).click();

		driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='first-filter']/div")).click();
		driver.findElement(By.xpath("(//span[@class='filter-name ']/parent::div)[1]")).click();
		driver.findElement(By.xpath("(//span[@class='filter-name ']/parent::div)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='title ']/parent::div)[5]")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[4]")).click();
		String text = driver.findElement(By.xpath("(//span[@class='filter-value'])[1]")).getText();
		if (text.contains("Shampoo")) {
			System.out.println("Shampoo filter applied");
		} else {
			System.out.println("Shampoo filter not applied");

		}

		driver.findElement(By.xpath("(//div[@id='product-list-wrap']//div)[1]")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> listHandles = new ArrayList<String>(handles);
		driver.switchTo().window(listHandles.get(1));
		WebElement findElement = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select dropDown = new Select(findElement);
		dropDown.selectByIndex(1);
		String text2 = driver.findElement(By.xpath("//span[text()='MRP:']/following::span[1]")).getText();
		System.out.println("the price is" + text2);
		// driver.findElement(By.xpath("(//button[@type='button']/span)[4]")).click();
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		driver.switchTo().frame(0);
		String text3 = driver.findElement(By.xpath("(//div[@class='value'])[4]")).getText();
		System.out.println("the grandtotal is " + text3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='PROCEED']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn full big']")).click();
		String text4 = driver.findElement(By.xpath("//span[text()='220']")).getText();
		if (text3.contains(text4)) {
			System.out.println("the grandtotal is same");

		} else {
			System.out.println("the grand total is different");
		}
		driver.quit();

	}

}
