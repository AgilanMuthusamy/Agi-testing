package week2.day2;

import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		/*
		 * http://leaftaps.com/opentaps/control/main
		 * 
		 * Delete Lead: 1 Launch the browser 2 Enter the username 3 Enter the password 4
		 * Click Login 5 Click crm/sfa link 6 Click Leads link 7 Click Find leads 8
		 * Click on Phone 9 Enter phone number 10 Click find leads button 11 Capture
		 * lead ID of First Resulting lead 12 Click First Resulting lead 13 Click Delete
		 * 14 Click Find leads 15 Enter captured lead ID 16 Click find leads button 17
		 * Verify message "No records to display" in the Lead List. This message
		 * confirms the successful deletion 18 Close the browser (Do not log out)
		 */

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement eleusername = driver.findElement(By.id("username"));
		eleusername.sendKeys("Demosalesmanager");
		WebElement elepassword = driver.findElement(By.id("password"));
		elepassword.sendKeys("crmsfa");
		WebElement eleclassname = driver.findElement(By.className("decorativeSubmit"));
		eleclassname.click();
		WebElement elelinktext = driver.findElement(By.linkText("CRM/SFA"));
		elelinktext.click();
		WebElement elelead = driver.findElement(By.linkText("Leads"));
		elelead.click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9988776655");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String Text2 = driver.findElement(By.xpath("//div[contains(@class, 'x-paging-info')]")).getAttribute("value");
		
		System.out.println("Text2%%%%%%%%%%%%"+Text2);
		if (Text2.contains("No records to display")) {
			System.out.println("verified");

		} else {
			System.out.println("not verified");
		}
driver.close();


	}

}
