package base;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.base.Supplier;

public class DriverFactory {

	private static ChromeOptions chromeOptions;

	private static ChromeOptions option() {
		chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--disable-notifications");
		chromeOptions
				.addArguments("user-data-dir=C:\\Users\\91962\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		chromeOptions.addArguments("--profile-directory=Default");
		return chromeOptions;
	}

	private final static Supplier<WebDriver> chromeSupplier = () -> {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		option();
		return new ChromeDriver(chromeOptions);
	};

	public static final Map<String, Supplier<WebDriver>> driverMap = new HashMap<>();
	static {
		driverMap.put("chrome", chromeSupplier);
	}

	public static WebDriver getDriver(String browserName) {
		return driverMap.get(browserName).get();

	}

}
