package interview.training2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name = 'searchVal']")).sendKeys("Bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for = 'Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for = 'Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String length = driver.findElement(By.xpath("//div[@class = 'length']")).getText();
		System.out.println("Total items Found is: " + length);
		Thread.sleep(2000);
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class= 'brand']"));
		Set<String> setbrand = new LinkedHashSet<String>();
		for (WebElement brandName : brand) {
			String str = brandName.getText();
			setbrand.add(str);
		}
		System.out.println("The Brand Names are: ");
		for (String eachbrand : setbrand) {

			System.out.println(eachbrand);

		}
		List<WebElement> bagname = driver.findElements(By.xpath("//div[@class = 'name']"));
		Set<String> setbagname = new LinkedHashSet<String>();
		for (WebElement bgname : bagname) {
			String bag = bgname.getText();
			setbagname.add(bag);
		}
		System.out.println("The Bag Names are: ");

		for (String bag1 : setbagname) {

			System.out.println(bag1);
		}
	}
}