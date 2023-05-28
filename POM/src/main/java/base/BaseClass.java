package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class BaseClass {

public static ChromeDriver driver;
public  String excelFileName;
@DataProvider
public String[][] provideData() throws IOException {
	
	return ReadExcel.readData(excelFileName);

}



@BeforeMethod
public void preCondition() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

}



@AfterMethod
public void postCondition() {
	driver.close();

}

	}


