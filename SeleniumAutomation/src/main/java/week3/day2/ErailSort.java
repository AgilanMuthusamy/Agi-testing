package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
//		Launch the browser

//		Launch the URL - https://erail.in/

//		Uncheck the check box - sort on date

//		clear and type in the source station 

//		clear and type in the destination station

//		Find all the train names using xpath and store it in a list

//		Use Java Collections sort to sort it and then print it
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("chkSelectDateOnly")).click();
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("chennai");
		driver.findElement(By.xpath("//div[@title='Chennai Egmore']")).click();
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[@title='Bangalore East']")).click();
		Thread.sleep(3000);
		List<WebElement> trainList = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]/a"));

		List<String> list = new ArrayList<String>();
		for (WebElement webElement : trainList) {
			String text = webElement.getText();
			list.add(text);

		}
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);

		}
		/*
		 * List<String> list = new ArrayList<String>(); for (WebElement webElement :
		 * trainList) { String text = webElement.getText(); list.add(text); }
		 * Collections.sort(list); for (String string : list) {
		 * System.out.println(string);
		 */

	}

}
