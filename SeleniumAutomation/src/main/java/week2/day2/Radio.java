package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElement(By.id("no")).click();
		boolean a = driver.findElement(By.xpath("//label[@for='Unchecked']/input")).isSelected();
		boolean b = driver.findElement(By.xpath("//label[@for='Checked']/input")).isSelected();

		if (a == true) {
			System.out.println("unchecked is selected");

		}
		if (b == true) {
			System.out.println("checked is selected");

		}
		boolean c = driver.findElement(By.xpath("//label[@for='java']/following::input[6]")).isSelected();
		if (c == true) {
			System.out.println("the value is already selected");
		} else {
			driver.findElement(By.xpath("//label[@for='java']/following::input[6]")).click();
		}
	}

}
