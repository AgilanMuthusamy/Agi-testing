package interview.training1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Demosalesmanager");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("agi");
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		System.out.println(driver.getTitle());
		if (driver.getTitle().contains("View Lead")) {
			System.out.println("Verified");

		} else {
			System.out.println("not verified");
		}

		driver.findElement(By.linkText("Edit")).click();
		String text = driver.findElement(By.id("updateLeadForm_companyName")).getText();

		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("AGW");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text != text2) {
			System.out.println("the name is changed");

		} else {
			System.out.println("not changed");

		}
		driver.close();
	}

}
