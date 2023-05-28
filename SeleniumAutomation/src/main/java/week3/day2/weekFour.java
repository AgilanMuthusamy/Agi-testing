package week3.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class weekFour {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://leafground.com/pages/Alert.html");
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);

		String text = alert.getText();
		System.out.println("simple alert text: " + alert.getText());
		alert.dismiss();
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		alert.sendKeys("agi");
		alert.accept();
		
		
	}

}
