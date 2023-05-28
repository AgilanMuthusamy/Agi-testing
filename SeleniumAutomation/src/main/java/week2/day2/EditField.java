package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditField {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("agilan.msamy@gmail.com");
		driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']//following::input"))
				.sendKeys("agilan");
		String text = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getText();
		System.out.println("The Inside Text :" + text);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("aravoind");
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		WebElement obj = driver.findElement(By.xpath("//input[@disabled='true']"));
		obj.isEnabled();
	//	obj.sendKeys("superstar");

	}

}
