package utils;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] readData(String file) throws IOException {
XSSFWorkbook wb = new XSSFWorkbook("./data/"+file+".xlsx");

	XSSFSheet ws = wb.getSheet("Sheet1");
  int rowNum = ws.getLastRowNum();
  short lastCellNum = ws.getRow(0).getLastCellNum();
  
  String[][]data = new String[rowNum][lastCellNum];
	for (int i = 1; i <= rowNum; i++) {
		
		
	
	for (int j = 0; j < lastCellNum; j++) {
		String value = ws.getRow(i).getCell(j).getStringCellValue();
		System.out.println(value);
		data[i-1][j]=value;
		
		
	}
	
	
	}
	wb.close();
	return data;
	
	}

}
