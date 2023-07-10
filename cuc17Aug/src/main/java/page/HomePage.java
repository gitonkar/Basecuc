package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.Events;
import object.Truist;

public class HomePage {

	Events event = new Events();

	private By heroHeading = By.cssSelector(Truist.heroHeading);
	private By heroCapheading = By.cssSelector(Truist.heroCapheading);
	private By heroSubheading = By.cssSelector(Truist.heroSubheading);
	private By heroRegisterButton = By.xpath(Truist.heroRegisterButton);
	private By SignInbutton = By.xpath(Truist.truist_signin_link);
	private By APICate_Subheading = By.cssSelector(Truist.APICate_Subheading);
	private By APIcate_heading = By.xpath(Truist.APIcate_heading);
	private By Nav_HomeLink = By.xpath(Truist.Nav_HomeLink);
	private By Nav_APIs = By.xpath(Truist.Nav_APIs);
	private By Nav_Support = By.xpath(Truist.Nav_Support);
	private By Category_Commercial = By.xpath(Truist.Category_Commercial);
	private By Category_Personal = By.xpath(Truist.Category_Personal);
	private By Category_Accounts = By.xpath(Truist.Category_Accounts);

	public boolean verifyNavlink(List<String> expectedstring) {

		List<String> originalstring = new ArrayList<String>();
		originalstring.add(event.getText(Nav_HomeLink));
		originalstring.add(event.getText(Nav_APIs));
		originalstring.add(event.getText(Nav_Support));

		Assert.assertEquals(originalstring, expectedstring, "Navlinks of the website do not match");

		return true;

	}

	public boolean verifySignInbutton(String expectedstring) {
		// TODO Auto-generated method stub
		String originalstring = event.getText(SignInbutton);
		Assert.assertEquals(originalstring, expectedstring, "SignInbutton of the website do not match");
		return true;
	}

	public boolean verifyAPICate_Subheading(String expectedstring) {
		// TODO Auto-generated method stub
		String originalstring = event.getText(APICate_Subheading);
		Assert.assertEquals(originalstring, expectedstring, "APICate_Subheading of the website do not match");
		return true;
	}

	public boolean verifyRegbutton(String expectedstring) {
		// TODO Auto-generated method stub
		String originalstring = event.getText(heroRegisterButton);

		String regWord = originalstring.substring(0, 8);

		System.out.println(regWord + "&&&&" + expectedstring);
		Assert.assertEquals(regWord, expectedstring, "heroRegisterButton of the website do not match");

		return true;
	}

	public boolean verifyAPIcate_heading(String expectedstring) {
		// TODO Auto-generated method stub
		String originalstring = event.getText(APIcate_heading);
		Assert.assertEquals(originalstring, expectedstring, "APIcate_heading of the website do not match");

		return true;
	}

	public boolean verifyAPIcategories(List<String> expectedstring) {
		// TODO Auto-generated method stub

		List<String> originalstring = new ArrayList<String>();
		originalstring.add(event.getText(Category_Commercial));
		originalstring.add(event.getText(Category_Personal));
		originalstring.add(event.getText(Category_Accounts));

		Assert.assertEquals(originalstring, expectedstring, "APIcategories of the website do not match");

		return true;

	}

	public boolean verifyHeroHeading(String expectedstring) {
		// TODO Auto-generated method stub
		String originalstring = event.getText(heroHeading);
		System.out.println(originalstring + "&&&&" + expectedstring);
		Assert.assertEquals(originalstring, expectedstring, "heroHeading of the website do not match");

		return true;
	}

	public boolean verifyHeroSubheading(String expectedstring) {
		// TODO Auto-generated method stub
		String originalstring = event.getText(heroSubheading);
		Assert.assertEquals(originalstring, expectedstring, "heroSubheading of the website do not match");
		return true;
	}

	public boolean verifyCapHeading(String expectedstring) {
		// TODO Auto-generated method stub
		String originalstring = event.getText(heroCapheading);
		Assert.assertEquals(originalstring, expectedstring, "heroCapheading of the website do not match");
		return true;
	}

}
