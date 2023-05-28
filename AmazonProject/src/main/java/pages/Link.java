package pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import base.BaseClass;

public class Link extends BaseClass {
	public static String text2;

	public String linkCheck(String url) throws IOException {
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to(url);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement text = driver.findElement(By.xpath("//span[@class='a-price a-text-price a-size-medium']"));// (//span[@class="a-price-whole"])[1]
		text.click();
		String text2 = text.getText();
		return text2;
	}

}
