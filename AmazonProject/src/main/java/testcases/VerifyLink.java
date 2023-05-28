package testcases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.BaseClass;
import base.DriverFactory;
import pages.Link;

public class VerifyLink extends BaseClass {

	public File file;
	public int lastRowNum;
	XSSFSheet sh;
	XSSFWorkbook wb;
	public int createRow;
	public int i = 1;

	@BeforeTest
	public void setValue() throws IOException {
		excelFileName = "Book1";
		System.out.println("Setupstart");
		file = new File("./data/Book2.xlsx");
		wb = new XSSFWorkbook();
		sh = wb.createSheet("AmazonProject");
		lastRowNum = sh.getLastRowNum();
		System.out.println("lastrownumber " + lastRowNum);
		System.out.println("i value " + i);
		XSSFRow row1 = sh.createRow(0);
		row1.createCell(0).setCellValue("ASINLINK");
		row1.createCell(1).setCellValue("PRICEOFPRODUCT");
		System.out.println("setupend");

	}

	@Test(dataProvider = "provideData")
	public void runVerifyLogin(String url) throws IOException {

		Link a = new Link();
		String text = "";
		try {
			text = a.linkCheck(url);
			i++;
			System.out.println("TRY VALUE OF i " + i);

		} catch (Exception e) {

			System.out.println("TEXTVALUEcatch" + e);
			i++;
		}
		System.out.println("TEXTVALUE" + text);
		
		XSSFRow row = sh.createRow(i - 1);
		row.createCell(0).setCellValue(url);

		if (text.equals("")) {
			row.createCell(1).setCellValue("");

		} else {
			row.createCell(1).setCellValue(text);

		}
		if (i == 250) {

			FileOutputStream fs = new FileOutputStream(file);
			wb.write(fs);
			wb.close();
			System.out.println("I inside If " + i);
		}
		System.out.println("i value++ " + i);

	}

}
