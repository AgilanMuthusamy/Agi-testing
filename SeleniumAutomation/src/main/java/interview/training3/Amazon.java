package interview.training3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);

		String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();

		System.out.println("first product price : " + text);
		String text2 = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("Customer Rating number : " + text2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class = 'a-icon a-icon-star-small a-star-small-4 aok-align-bottom']"))
				.click();
	String percentageRating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text']) "))
				.getAttribute("text");

		System.out.println(percentageRating);
		driver.findElement(By.xpath("//span[@class = 'a-size-medium a-color-base a-text-normal']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(winList.get(1));
		WebElement findElement = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']//img"));
		File src = findElement.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/mobile.png");
		FileUtils.copyFile(src, des);
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button")).click();
		String finalprice = driver.findElement(By.xpath("//span[@id = 'attach-accessory-cart-subtotal']")).getText();
		if (text.contains(finalprice)) {
			System.out.println("The Cart Value is Same");
		} else {
			System.out.println("The Cart Value is Different");
		}

	}

}
