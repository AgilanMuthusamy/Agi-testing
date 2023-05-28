package interview.training1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("agi@gmail.com");
		driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following::input"))
				.sendKeys("agi");
		String name = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getText();
		System.out.println("Captured Text is:" + name);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		boolean dis = driver.findElement(By.xpath("//input[@disabled = 'true']")).isEnabled();
		if (dis == true) {
			System.out.println("The field is editable");

		} else {
			System.out.println("The field is Uneditable");
		}

	}

}
