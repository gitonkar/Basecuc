package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.BrowserFactory;

public class Base extends AbstractTestNGCucumberTests {

	// private static WebDriver driver;
	static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<WebDriver>();
	private WebDriver driver;
	Events event = new Events();

	@BeforeClass
	@Parameters(value = "browserName")
	public boolean launchBrowser(String brName) {
		BrowserFactory br = new BrowserFactory();
		driver = br.setup(brName);
		threadLocalDriver.set(driver);
		event.set(threadLocalDriver);
		System.out.println("Before Test Thread ID: " + Thread.currentThread().getId());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return false;
	}

	@AfterClass
	public boolean tearDown() {
		// driver.quit();
		return false;
	}
}
