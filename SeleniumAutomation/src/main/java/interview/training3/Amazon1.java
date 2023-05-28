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

public class Amazon1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple",Keys.ENTER);
String actValue = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
System.out.println("first" +actValue);
Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Blue')]")).click();
Set<String> setWindow = driver.getWindowHandles();
List<String> listWindow = new ArrayList<String>(setWindow);
driver.switchTo().window(listWindow.get(1));
Thread.sleep(2000);


WebElement photo = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']/img"));
File src = photo.getScreenshotAs(OutputType.FILE);
File dst = new File("./snaps/iphone1.png");
FileUtils.copyFile(src, dst);

driver.switchTo().window(listWindow.get(0));
driver.quit();







	}

}
