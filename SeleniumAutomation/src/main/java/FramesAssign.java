import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesAssign {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		/*1.Take the the screenshot of the click me button of first frame
		2.Find the number of frames
		  - find the Elements by tagname - iframe
		  - Store it in a list
		  - Get the size of the list. (This gives the count of the frames visible to the main page)*/
		WebElement findElement = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[1]"));	
		driver.switchTo().frame(findElement);
		WebElement findElement2 = driver.findElement(By.id("Click"));
		File screenshotAs = findElement2.getScreenshotAs(OutputType.FILE);
        File screenshotAs1 = new File("./snaps/button.png");
        FileUtils.copyFile(screenshotAs, screenshotAs1);
        driver.switchTo().defaultContent();
    	List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		System.out.println("the number of frames is: "+ findElements.size());
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
