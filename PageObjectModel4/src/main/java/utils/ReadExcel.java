package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][]  readData(String file) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./data/"+file+".xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int lastRowNum = ws.getLastRowNum();
		// System.out.println(lastRowNum);
		int lastCellNum = ws.getRow(0).getLastCellNum();
		// System.out.println(lastCellNum);
		// to count from firstRow
		// int physicalNumberOfRows = ws.getPhysicalNumberOfRows();

		String[][] data = new String[lastRowNum][lastCellNum];
		for (int i = 1; i <= lastRowNum; i++) {

			for (int j = 0; j < lastCellNum; j++) {
				XSSFRow row = ws.getRow(i);
				XSSFCell cell = row.getCell(j);
				String text = cell.getStringCellValue();
				// String text = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(text);
				data[i - 1][j] = text;
			}
		}

		wb.close();
		return data;

	}

}
