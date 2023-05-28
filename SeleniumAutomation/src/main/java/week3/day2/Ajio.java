package week3.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.checkerframework.framework.qual.FromByteCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * 1. Launch the URL https://www.ajio.com/ 2. In the search box, type as "bags"
		 * and press enter 3. To the left of the screen under " Gender" click the "Men"
		 * 4. Under "Category" click "Fashion Bags" 5. Print the count of the items
		 * Found. 6. Get the list of brand of the products displayed in the page and
		 * print the list. 7. Get the list of names of the bags and print it
		 */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::label)[5]")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		@SuppressWarnings("unchecked")
		List<WebElement> productBrand = (List<WebElement>) driver.findElement(By.xpath("//div[@class='brand']"));
		Set<String> setOfBrands = new LinkedHashSet<String>();
		for (WebElement eachBrand : productBrand) {
			String text2 = eachBrand.getText();
			System.out.println(text2);
		}
		for (String eachSetValue : setOfBrands) {
			System.out.println(eachSetValue);

		}

	}

}
