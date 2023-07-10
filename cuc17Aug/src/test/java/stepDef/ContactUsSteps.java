package stepDef;

import java.util.List;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.Truist;
import page.CommonPage;
import page.ContactPage;

public class ContactUsSteps {

	ContactPage page = new ContactPage();
	CommonPage comnpage = new CommonPage();

	@When("User click on support nav arrow")
	public void user_click_on_support_nav_arrow() {

		page.clickOnSupportNavArrow();
	}

	@Then("User able to click {string} link")
	public void user_able_to_click_link(String string) {
		if (comnpage.verifyText_Assertion(string, Truist.ContactUslnk)) {
			page.clickOnContactUs();
		} else {
			System.out.println("verifyContactUslnk find failed");
		}

	}

	@Then("User able to validate Contact Us page url and title loaded.")
	public void user_able_to_validate_contact_us_page_url_and_title_loaded(io.cucumber.datatable.DataTable dataTable) {

		List<List<String>> urltitle = dataTable.asLists(String.class);
		String url = urltitle.get(0).get(0);
		String title = urltitle.get(0).get(1);

		if (comnpage.verifyUrlTitle_txt(url, title)) {
			// System.out.println("verifyurl success");
		} else {
			System.out.println("verifyurl failed");
		}
	}

	@Then("User fill the ContactUs form.")
	public void fill_contact_details(io.cucumber.datatable.DataTable dataTable) {

		page.clickOnSupportNavArrow();
		page.clickOnContactUs();
		List<List<String>> urltitle = dataTable.asLists(String.class);
		page.fillContactUs_form(urltitle);

	}

	@Then("User able to verify {string} CapHeading")
	public void user_able_to_verify_cap_heading(String string) {
		comnpage.verifyText_Assertion(string, Truist.ContUsCapheading);
	}

	@Then("User able to verify {string} page heading")
	public void user_able_to_verify_heading(String string) {
		comnpage.verifyText_Assertion(string, Truist.ContUs_heading);
	}

	@Then("User able to verify {string} link on page")
	public void user_able_to_verify_link(String string) {
		comnpage.verifyText_Assertion(string, Truist.ContUs_CreatAcclink);
	}

	@Then("User click on {string} button")
	public void user_click_on_button(String string) {
		if (comnpage.verifyText_Assertion(string, Truist.ContUs_Cancelbtn)) {
			page.clickOnCancelbtn();
		} else {
			System.out.println("verifyContactUslnk find failed");
		}
	}

	@Then("User Validate {string} message.")
	public void user_validate_message(String string) {

	}

}
