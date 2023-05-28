package interview.training3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//table[@class='twoColumnForm']/tbody/tr/td[2]/a")).click();
		Set<String> winSet = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(winSet);
		driver.switchTo().window(winList.get(1));
		driver.findElement(By.xpath("//table[@class = 'x-grid3-row-table']/tbody/tr/td[3]")).click();
		driver.switchTo().window(winList.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//td[@class = 'titleCell'])[2]/following-sibling::td/a")).click();
		Set<String> winset2 = driver.getWindowHandles();
		List<String> winlist2 = new ArrayList<String>(winset2);
		driver.switchTo().window(winlist2.get(1));
		driver.findElement(By.xpath("//div[@class = 'x-grid3-row    x-grid3-row-alt']/table/tbody/tr/td[3]/div/a"))
				.click();
		driver.switchTo().window(winlist2.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String title = driver.getTitle();
		if (title.contains("View Contact")) {
			System.out.println("verified");

		} else {
			System.out.println("not verified");
		}

	}

}
