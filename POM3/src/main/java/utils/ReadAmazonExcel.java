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
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadAmazonExcel {
	
	
	
	
	 public static  void main(String args[]) throws IOException  {
		 
		 
		 
			
	        
	        //Create an object of File class to open xlsx file
	        File file =    new File("./data/Book1.xlsx");
	        
	        //Create an object of FileInputStream class to read excel file
	        FileInputStream inputStream = new FileInputStream(file);
	        
	        //Creating workbook instance that refers to .xls file
	        XSSFWorkbook wb=new XSSFWorkbook(inputStream);
	        
	        //Creating a Sheet object using the sheet Name
	        XSSFSheet sheet=wb.getSheet("Sheet1");
	        
	        //Create a row object to retrieve row at index 1
	       
	        int lastRowNum = sheet.getLastRowNum();
	        
	        
	        for (int i = 1; i <=lastRowNum; i++) {
	        	String val =sheet.getRow(i).getCell(0).getStringCellValue();
				System.out.println(val);
			}
	        WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        
	      
	    }
	 
	 
	 
	}


