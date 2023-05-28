package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class BaseClass {

public static ChromeDriver driver;
public  String excelFileName;
public static ExtentReports extent;
public static ExtentTest test;
public String testName,testDescription,testCategory,testAuthor;
@DataProvider
public String[][] provideData() throws IOException {
	
	return ReadExcel.readData(excelFileName);

}


@BeforeSuite
public void startReport() {
	
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
	reporter.setAppendExisting(true);
	 extent = new ExtentReports();
	extent.attachReporter(reporter);
	
	

}
@BeforeClass
public void testCaseDetails() {
	 test = extent.createTest(testName,testDescription);
	test.assignCategory(testCategory);
	test.assignAuthor(testAuthor);

}
public int takeSnap() throws IOException {

	int ranNum = (int) (Math.random() * 999999 + 999999);

	File source = driver.getScreenshotAs(OutputType.FILE);

	File target = new File("./data/img"+ranNum+".png");
	FileUtils.copyFile(source, target);
	return ranNum; 
}
public void reportStep(String msg,String status) throws IOException {
	if (status.equalsIgnoreCase("pass")) {
		test.pass(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././data/img"+takeSnap()+".png").build());
	}
		else if (status.equalsIgnoreCase("fail")) {
			test.fail(msg,MediaEntityBuilder.createScreenCaptureFromPath(".././data/img"+takeSnap()+".png").build());
			throw new RuntimeException("Look into report for failure details");
			
		}
		
	}



@AfterSuite
public void endReport() {
	extent.flush();

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


