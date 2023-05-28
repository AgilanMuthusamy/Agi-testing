package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {
		
		
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowNum = ws.getLastRowNum();
		int lastCellNum = ws.getRow(0).getLastCellNum();
		String[][] data = new String[rowNum][lastCellNum];
		
		for (int i = 1; i <= rowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
				
				String text = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(text);

				
				data[i-1][j]=text;
			}
			
		}
		
		
		wb.close();
		return data;
		
	}

}
