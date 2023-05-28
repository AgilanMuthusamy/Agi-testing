package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:\\Users\\91962\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
	//	options.addArguments("--incognito");
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();//https://www.amazon.fr/dp/B00155090U
		driver.get("https://www.amazon.fr/dp/B00155090U");//
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
	 WebElement element = driver.findElement(By.xpath("//div[@class='a-box-inner'] //span[@class='a-price aok-align-center']"));
	 element.click();
	 String text = element.getText();
	
		
		System.out.println(text);
		
		
		
		
		
//		String finalReport;
//		System.out.println(finalReport = url + "=" + text2);
		//driver.close();
//		File file = new File("./data/Book2.xlsx");
//		XSSFWorkbook wb = new XSSFWorkbook();
//		XSSFSheet sh = wb.createSheet("AmazonProjet");
//		 int lastRowNum = sh.getLastRowNum();
//		XSSFRow row1 = sh.createRow(0);
//		row1.createCell(0).setCellValue("LINK");
//		row1.createCell(1).setCellValue("PRICE");
//
//		for (int i = 1; i < lastRowNum; i++) {
//			XSSFRow row = sh.createRow(i);
//
//			row.createCell(0).setCellValue(url);
//			row.createCell(1).setCellValue(text2);
//
//		}
//
//		FileOutputStream fs = new FileOutputStream(file);
//		wb.write(fs);
//		wb.close();
	

		//return ;
        
	}

}
