package page;

import java.util.List;

import org.openqa.selenium.By;

import base.Events;
import object.Truist;

public class RegisterPage {

	Events event = new Events();

	private By truist_regbtn = By.xpath(Truist.truist_regbtn);
	private By truist_firstnametxt = By.xpath(Truist.truist_firstnametxt);
	private By truist_lastnametxt = By.xpath(Truist.truist_lastnametxt);
	private By truist_cmpnametxt = By.xpath(Truist.truist_cmpnametxt);
	private By truist_empemailtxt = By.xpath(Truist.truist_empemailtxt);
	private By trist_submitbtn = By.xpath(Truist.trist_submitbtn);

	public void createAccount() {
		// TODO Auto-generated method stub
		event.click(truist_regbtn);

	}

	public void registerUser(List<List<String>> userlist) {
		// TODO Auto-generated method stub

		for (List<String> list : userlist) {
			for (int i = 0; i < list.size(); i++) {
				// System.out.println(list.get(i));
				switch (i) {
				case 0:
					event.sendKeys(truist_firstnametxt, list.get(i));
					break;
				case 1:
					event.sendKeys(truist_lastnametxt, list.get(i));
					break;
				case 2:
					event.sendKeys(truist_cmpnametxt, list.get(i));
					break;
				case 3:
					event.sendKeys(truist_empemailtxt, list.get(i));
					break;
				default:
					break;
				}

			}
		}
	}

}
