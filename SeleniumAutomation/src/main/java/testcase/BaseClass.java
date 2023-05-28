package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class BaseClass  {
	public static ChromeDriver driver;
	public String excelFileName;
	@DataProvider
	public String[][] provideData() throws IOException {
//		ReadExcel re = new ReadExcel();
//		String[][] readData = re.readData();
		
		return ReadExcel.readData(excelFileName);
		
		

	}
	@Parameters({"url","username","password"})
	@BeforeMethod
	public  void preconditions(String url, String uName, String pwd) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		
	}  
	@AfterMethod
	public  void postconditions() {
		driver.close();
		
		
	}
	
	

}
