package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Events {

	private static ThreadLocal<WebDriver> threadlocal;

	public void set(ThreadLocal<WebDriver> threadLocalDriver) {
		// TODO Auto-generated method stub
		this.threadlocal = threadLocalDriver;
	}

	private synchronized WebDriver getDriver() {
		return threadlocal.get();

	}

	public boolean navigateEvent(String url) {
		// TODO Auto-generated method stub
		System.out.println(url);
		getDriver().navigate().to(url);
		return true;

	}

	public void clickNavArrow(By ref) {
		getDriver().findElement(ref).click();
	}

	public void click(By ref) {
		// TODO Auto-generated method stub
		WebElement element = getDriver().findElement(ref);
		Actions actions = new Actions(getDriver());
		actions.moveToElement(element).click().build().perform();
	}

	public void sendKeys(By txt, String str) {
		// TODO Auto-generated method stub
		getDriver().findElement(txt).sendKeys(str);

	}

	public void expWait(String truistSigninBtn) {
		WebElement firstResult = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(truistSigninBtn)));
	}

	public void navigateBack() {
		// TODO Auto-generated method stub
		getDriver().navigate().back();
		getDriver().navigate().refresh();

	}

	public String getText(By heroHeading) {
		// TODO Auto-generated method stub
		String temp = getDriver().findElement(heroHeading).getText();

		if (temp != null) {
			return temp;
		} else {
			return null;
		}

	}

	public String getUrl() {
		// TODO Auto-generated method stub
		return getDriver().getCurrentUrl();
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return getDriver().getTitle();
	}

	public void select_visibleText(By contUs_WhyDropdown, String string) {
		// TODO Auto-generated method stub

		Select dropdown = new Select(getDriver().findElement(contUs_WhyDropdown));
		// dropdown.selectByVisibleText(string);
		dropdown.selectByIndex(0);
	}

}
