package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println("The Location is :" + location);
		String color = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("The Color is:" + color);
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println("The Size is" + size);

	}

}
