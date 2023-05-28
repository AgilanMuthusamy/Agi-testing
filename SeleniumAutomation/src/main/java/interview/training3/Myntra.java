package interview.training3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		Actions builder = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='desktop-navContent'])[1]"));
		builder.moveToElement(findElement).perform();
		driver.findElement(By.xpath("//a[text()='Jackets']")).click();
		String text1 = driver.findElement(By.xpath("//span[@class='title-count']")).getText().replaceAll("\\D", "");
		System.out.println("a"+text1);
		Integer jacketCount = Integer.parseInt(text1);
		System.out.println("b"+jacketCount);
		String text2 = driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText().replaceAll("\\D",
				"");

		Integer jackets = Integer.parseInt(text2);
		String text3 = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText().replaceAll("\\D",
				"");
		Integer rainJackets = Integer.parseInt(text3);
		Integer sumCategories = jackets + rainJackets;

		if (sumCategories.equals(jacketCount)) {
			System.out.println("the sum of categories count matches the total count of item");

		} else {
			System.out.println("count does not match");

		}
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("Duke");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class = ' common-customCheckbox']")).click();
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		List<WebElement> count = driver.findElements(By.xpath("//h3[text() = 'Duke']"));
		for (WebElement webElement : count) {
			String text = webElement.getText();
			if (text.equals("Duke")) {
				System.out.println("All the Brands are Duke");

			} else {
				System.out.println("All the Brands are  not equal");
			}

		}
		WebElement sort = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		builder.moveToElement(sort).perform();
		driver.findElement(By.xpath("//label[text() = 'Better Discount']")).click();
		WebElement discountPrice = driver.findElement(By.xpath("//span[@class = 'product-discountedPrice']"));
		System.out.println("Discounted price is : " + discountPrice.getText());
		driver.findElement(By.xpath("//span[@class = 'product-discountedPrice']")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(winList.get(1));
		//WebElement screenShot = driver.findElement(By.xpath("(//div[@class='image-grid-image'])[1]"));
		File a = driver.getScreenshotAs(OutputType.FILE);
		File b = new File("./snaps/img2.png");
		FileUtils.copyFile(a, b);
		driver.findElement(By.xpath("(//span[@class='desktop-userTitle'])[2]")).click();
		driver.quit();
	}

}
