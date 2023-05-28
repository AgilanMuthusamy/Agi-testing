package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadAmazonExcel;

public class BaseClass {
	public static WebDriver driver;
	public static String excelFileName;

	@DataProvider
	public String[] provideData() throws IOException {
		return ReadAmazonExcel.readData(excelFileName);
	}

	@BeforeMethod
	public void preCondition() {
		driver = (ChromeDriver) DriverFactory.getDriver("chrome");
	}

	@AfterMethod
	public void postCondition() {
		driver.quit();
	}
}
