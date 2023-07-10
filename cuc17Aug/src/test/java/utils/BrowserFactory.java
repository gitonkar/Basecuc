package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory {
	WebDriver driver = null;

	public WebDriver setup(String brName) {

		if (brName.equalsIgnoreCase("truist")) {
			// steup chrome browser
			// WebDriverManager.chromedriver().setup();

			// Add options for --headed or --headless browser launch
			System.setProperty("webdriver.chrome.driver", "C:\\chrome111\\chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*");

			// initialize driver for chrome
			driver = new ChromeDriver(chromeOptions);

			// maximize window
			driver.manage().window().maximize();

			// add implicit timeout
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		}
		return driver;
	}
}
