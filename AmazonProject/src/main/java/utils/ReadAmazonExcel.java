package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadAmazonExcel {

	public static String[] readData(String Fil) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./data/" + Fil + ".xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet2");
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("R" + lastRowNum);
		String[] data = new String[lastRowNum];
		for (int i = 1; i <= lastRowNum; i++) {
			System.out.println(i);
			String val = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(val);
			data[i - 1] = val;
		}
		return data;
	}

}

