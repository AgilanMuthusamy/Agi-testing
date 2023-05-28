package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplicationJavaAssignment {

	public static void main(String[] args) {

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
		WebElement elecreatelead = driver.findElement(By.linkText("Create Lead"));
		elecreatelead.click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("AG");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/05/1996");
		WebElement elecompanyname = driver.findElement(By.id("createLeadForm_companyName"));
		elecompanyname.sendKeys("Amazon");

		WebElement elecountrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		elecountrycode.sendKeys("+91");
		WebElement elephonenumber = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		elephonenumber.sendKeys("9629376573");
		WebElement elephoneareacode = driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode"));
		elephoneareacode.sendKeys("04146");
		WebElement elephoneextension = driver.findElement(By.id("createLeadForm_primaryPhoneExtension"));
		elephoneextension.sendKeys("044");
		WebElement eleemail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		eleemail.sendKeys("agilan.msamy@gmail.com");
		WebElement elephoneaskforname = driver.findElement(By.id("createLeadForm_primaryPhoneAskForName"));
		elephoneaskforname.sendKeys("Agi");
		WebElement eleweburl = driver.findElement(By.id("createLeadForm_primaryWebUrl"));
		eleweburl.sendKeys("http://leaftaps.com/opentaps/control/login");
		WebElement elegeneraltoname = driver.findElement(By.id("createLeadForm_generalToName"));
		elegeneraltoname.sendKeys("Agilan");
		WebElement elegeneralatname = driver.findElement(By.id("createLeadForm_generalAttnName"));
		elegeneralatname.sendKeys("Agilan Muthusamy");
		WebElement eleaddress1 = driver.findElement(By.id("createLeadForm_generalAddress1"));
		eleaddress1.sendKeys("18,Gowtham Nagar, Second cross street");
		WebElement eleaddress2 = driver.findElement(By.id("createLeadForm_generalAddress2"));
		eleaddress2.sendKeys("Salmedu, Villupuram");
		WebElement elegeneralcity = driver.findElement(By.id("createLeadForm_generalCity"));
		elegeneralcity.sendKeys("Chennai");
		WebElement elestatename = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		elestatename.sendKeys("Tamilnadu");
		WebElement elepostalcode = driver.findElement(By.id("createLeadForm_generalPostalCode"));
		elepostalcode.sendKeys("605602");
		WebElement elecountryid = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		elecountryid.sendKeys("INDIA");
		WebElement elepostalcodeextension = driver.findElement(By.id("createLeadForm_generalPostalCodeExt"));
		elepostalcodeextension.sendKeys("605602");
		String text = driver.findElement(By.id("createLeadForm_firstName")).getText();
		driver.getTitle();
		System.out.println("The First Name is:" + text);
		WebElement elesmallsubmit = driver.findElement(By.className("smallSubmit"));
		elesmallsubmit.click();

		System.out.println("The Title is" + driver.getTitle());
		if (driver.getTitle().contains(" Create Lead ")) {
			System.out.println("The title contails Create Lead");
		}

		else {
			System.out.println("The Title not contains Create Lead");
		}

	}

}
