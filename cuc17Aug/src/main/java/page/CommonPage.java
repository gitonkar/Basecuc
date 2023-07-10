package page;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.Events;

public class CommonPage {

	Events event = new Events();

	public boolean verifyUrlTitle_txt(String expectedUrl, String expectedTitle) {
		// TODO Auto-generated method stub
		String originalUrl = event.getUrl();
		String originalTitle = event.getTitle();
		Assert.assertEquals(originalUrl, expectedUrl, "expectedUrl of the website do not match");
		Assert.assertEquals(originalTitle, expectedTitle, "expectedTitle of the website do not match");
		return true;
	}

	public boolean verifyText_Assertion(String expectedstring, String webelement) {
		// TODO Auto-generated method stub
		By localWebelement = By.xpath(webelement);
		String originalstring = event.getText(localWebelement);
		Assert.assertEquals(originalstring, expectedstring, "heroCapheading of the website do not match");
		return true;
	}

}
