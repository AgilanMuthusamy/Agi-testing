package base;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class ProjectSpecificMethods {
	
	public  ChromeDriver driver;
	public String excelFileName;
	public static Properties prop = new Properties();
	
	@DataProvider
	public String[][] provideData() throws IOException {
//	ReadExcel re = new ReadExcel();
	//	String[][] readData = re.readData();
	return ReadExcel.readData(excelFileName);
	}
	
	
	@BeforeMethod
	public  void preconditions() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.id("username")).sendKeys(uName);
//		driver.findElement(By.id("password")).sendKeys(pwd);
//		driver.findElement(By.className("decorativeSubmit")).click();
//		driver.findElement(By.linkText("CRM/SFA")).click();
//		driver.findElement(By.linkText("Leads")).click();
//		
		
	}  
	@AfterMethod
	public  void postconditions() {
		driver.close();
		
		
	}
	
	

}
