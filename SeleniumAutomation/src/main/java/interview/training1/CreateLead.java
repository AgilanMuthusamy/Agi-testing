package interview.training1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AGW");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Agi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("m");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("agilan");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("m");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("z");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("y");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2500000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("abcd");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("abcdef");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("636103");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("636103");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("agilan.msamy@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8888899999");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("agi");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("abc@xyz.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("agi");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("agi");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("151/4");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("k.m.nagar");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("636");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("636103");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("vpm");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		WebElement findElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropDown = new Select(findElement);
		dropDown.selectByVisibleText("Texas");

		String test = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");

		System.out.println(test);
		String test2 = driver.findElement(By.id("createLeadForm_firstNameLocal")).getAttribute("value");
		System.out.println(test2);
		driver.findElement(By.name("submitButton")).click();
		if (driver.getTitle().contains("View Lead")) {
			System.out.println("view lead is verified");

		} else {
			System.out.println("view lead is not verified");
		}
	}

}
