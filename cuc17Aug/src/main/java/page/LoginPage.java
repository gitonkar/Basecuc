package page;

import org.openqa.selenium.By;

import base.Events;
import object.Truist;

public class LoginPage {

	Events event = new Events();

	private By truist_signin_link = By.xpath(Truist.truist_signin_link);
	private By truist_signin_btn = By.xpath(Truist.truist_signin_btn);
	private By truist_userid_txt = By.xpath(Truist.truist_userid_txt);
	private By truist_password_txt = By.xpath(Truist.truist_password_txt);
	private By truist_signinbackbtn = By.xpath(Truist.truist_signinback);

	public boolean launchUrl(String url) {
		event.navigateEvent(url);
		return true;
	}

	public boolean loginUser(String userid, String pass) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.out.println(userid + " and " + pass);
		event.click(truist_signin_link);
		event.expWait(Truist.truist_signin_btn);
		event.sendKeys(truist_userid_txt, userid);
		event.expWait(Truist.truist_signin_btn);
		event.sendKeys(truist_password_txt, pass);
		Thread.sleep(8000);
		event.click(truist_signin_btn);

		/*
		 * event.expWait(Truist.truist_signin_btn); event.click(truist_signin_btn);
		 * event.click(truist_signin_link); event.expWait(Truist.truist_signin_btn);
		 * event.sendKeys(truist_userid_txt, userid);
		 * event.expWait(Truist.truist_signin_btn); event.sendKeys(truist_password_txt,
		 * pass); event.click(truist_signin_btn);
		 */
		return false;
	}
}
