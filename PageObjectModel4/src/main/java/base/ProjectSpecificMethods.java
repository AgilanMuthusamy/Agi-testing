package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

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

public class ProjectSpecificMethods {

	public ChromeDriver driver;
	public String excelFileName;
	public static Properties prop = new Properties();
	public static ExtentReports extent;
	public String testName, testDescription, testCategory, testAuthor;
	public static ExtentTest test,node;

	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");

		reporter.setAppendExisting(true);

		extent = new ExtentReports();

		extent.attachReporter(reporter);
	}

	@BeforeClass
	public void testcaseDetails() {
		test = extent.createTest(testName, testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);

	}

	public int takeSnap() throws IOException {

		int ranNum = (int) (Math.random() * 999999 + 999999);

		File source = driver.getScreenshotAs(OutputType.FILE);

		File target = new File("./snaps/img"+ranNum+".png");
		FileUtils.copyFile(source, target);
		return ranNum; 

	}

	public void reportStep(String msg, String status) throws IOException {
		if (status.equalsIgnoreCase("pass")) {
			node.pass(msg, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png").build());
					

		} else if (status.equalsIgnoreCase("fail")) {
			node.fail(msg, MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img"+takeSnap()+".png")
					.build());
			throw new RuntimeException("Look into report for details");
		}

	}

	@AfterSuite
	public void stopReport() {
		extent.flush();

	}

	@DataProvider
	public String[][] provideData() throws IOException {
//	ReadExcel re = new ReadExcel();
		// String[][] readData = re.readData();
		return ReadExcel.readData(excelFileName);
	}

	@BeforeMethod
	public void preconditions() {
		 node = test.createNode(testName);
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
	public void postconditions() {
		driver.close();

	}

}
