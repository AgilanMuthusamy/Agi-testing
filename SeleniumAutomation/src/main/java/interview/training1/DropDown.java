package interview.training1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement findElement = driver
				.findElement(By.xpath("//option[text()='Get the number of dropdown options']/parent::select"));
		Select dd = new Select(findElement);
		List<WebElement> options = dd.getOptions();
		int size = options.size();
		System.out.println(size);
		String title = driver.getTitle();
		System.out.println(title);
		if (driver.getPageSource().contains("TestLeaf - Interact with Drop downs")) {
			System.out.println("passed");

		} else {
			System.out.println("failed");
		}

	}

}
