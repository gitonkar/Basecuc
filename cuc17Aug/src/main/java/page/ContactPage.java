package page;

import java.util.List;

import org.openqa.selenium.By;

import base.Events;
import object.Truist;

public class ContactPage {

	Events event = new Events();

	private By supportNavclick = By.xpath(Truist.supportNavclick);
	private By ContactUslnk = By.xpath(Truist.ContactUslnk);
	private By ContUs_Cancelbtn = By.xpath(Truist.ContUs_Cancelbtn);
	private By ContUs_FirstNmTxtbox = By.xpath(Truist.ContUs_FirstNmTxtbox);
	private By ContUs_LastNmTxtbox = By.xpath(Truist.ContUs_LastNmTxtbox);
	private By ContUs_EmailTxtbox = By.xpath(Truist.ContUs_EmailTxtbox);
	private By ContUs_PhoneTxtbox = By.xpath(Truist.ContUs_PhoneTxtbox);
	private By ContUs_WhyDropdown = By.xpath(Truist.ContUs_WhyDropdown);
	private By ContUs_MsgTxtbox = By.xpath(Truist.ContUs_MsgTxtbox);
	private By ContUs_WhyDropOp1 = By.xpath(Truist.ContUs_WhyDropOp1);

	public void clickOnSupportNavArrow() {
		// TODO Auto-generated method stub
		event.clickNavArrow(supportNavclick);
	}

	public void clickOnContactUs() {
		// TODO Auto-generated method stub
		event.click(ContactUslnk);
	}

	public void fillContactUs_form(List<List<String>> userlist) {
		// TODO Auto-generated method stub
		for (List<String> list : userlist) {
			for (int i = 0; i < list.size(); i++) {

				System.out.println(list.get(i));

				switch (i) {
				case 0:
					event.expWait(Truist.ContUs_FirstNmTxtbox);
					event.sendKeys(ContUs_FirstNmTxtbox, list.get(i));
					break;
				case 1:
					event.sendKeys(ContUs_LastNmTxtbox, list.get(i));
					break;
				case 2:
					event.sendKeys(ContUs_EmailTxtbox, list.get(i));
					break;
				case 3:
					event.sendKeys(ContUs_PhoneTxtbox, list.get(i));
					break;
				case 4:
					event.click(ContUs_WhyDropdown);
					event.click(ContUs_WhyDropOp1);
					// event.select_visibleText(ContUs_WhyDropdown, list.get(i));
					break;
				case 5:
					event.sendKeys(ContUs_MsgTxtbox, list.get(i));
					break;
				default:
					break;
				}

			}
		}

	}

	public void clickOnCancelbtn() {
		// TODO Auto-generated method stub
		event.click(ContUs_Cancelbtn);
	}
}
