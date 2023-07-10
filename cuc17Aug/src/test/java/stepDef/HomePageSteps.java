package stepDef;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import page.HomePage;
import page.LoginPage;

public class HomePageSteps {

	HomePage homepage = new HomePage();
	LoginPage loginPage = new LoginPage();

	@Given("the home page for Dev Portal is reached and title verified")
	public void the_home_page_for_dev_portal_is_reached_and_title_verified(io.cucumber.datatable.DataTable dataTable) {
		String url = null;
		List<String> data = new ArrayList<String>();
		data = dataTable.column(0);
		for (String string : data) {
			url = string;
		}
		System.out.println("Homepage:url:" + url);
		loginPage.launchUrl(url);
	}

	@Then("the home page navigation section has the following links")
	public void the_home_page_navigation_section_has_the_following_links(io.cucumber.datatable.DataTable dataTable) {
		List<String> navlink = new ArrayList<String>();
		navlink = dataTable.column(0);
		if (homepage.verifyNavlink(navlink)) {
			System.out.println("Navlink Verify success");
		} else {
			System.out.println("Navlink Verify failed");
		}

	}

	@Then("the home page navigation section has the Truist logo")
	public void the_home_page_navigation_section_has_the_truist_logo() {
		System.out.println("Truist_logo Verify success");
	}

	@Then("the home page navigation section has the {string} button")
	public void the_home_page_navigation_section_has_the_button(String string) {

		if (homepage.verifySignInbutton(string)) {
			System.out.println("verifySignInbutton success");
		} else {
			System.out.println("verifySignInbutton failed");
		}

	}

	@Then("the home page hero section has the {string} button")
	public void the_home_page_hero_section_has_the_button(String string) {
		if (homepage.verifyRegbutton(string)) {
			System.out.println("verifyRegbutton success");
		} else {
			System.out.println("verifyRegbutton failed");
		}
	}

	@Then("the home page hero section has the {string} CapHeading")
	public void the_home_page_hero_section_has_the_cap_heading(String string) {
		if (homepage.verifyCapHeading(string)) {
			System.out.println("verifyCapHeading success");
		} else {
			System.out.println("verifyCapHeading failed");
		}
	}

	@Then("the home page hero section has the {string}  heading")
	public void the_home_page_hero_section_has_the_heading(String string) {
		if (homepage.verifyHeroHeading(string)) {
			System.out.println("verifyHeroHeading success");
		} else {
			System.out.println("verifyHeroHeading failed");
		}
	}

	@Then("the home page hero section has the {string} subheading")
	public void the_home_page_hero_section_has_the_subheading(String string) {
		if (homepage.verifyHeroSubheading(string)) {
			System.out.println("verifyHeroSubheading success");
		} else {
			System.out.println("verifyHeroSubheading failed");
		}
	}

	@Then("the API Categories section has the following links")
	public void the_api_categories_section_has_the_following_links(io.cucumber.datatable.DataTable dataTable) {
		List<String> apiCateg = new ArrayList<String>();
		apiCateg = dataTable.column(0);
		if (homepage.verifyAPIcategories(apiCateg)) {
			System.out.println("verifyAPIcategories success");
		} else {
			System.out.println("verifyAPIcategories failed");
		}
	}

	@Then("the home page Truist APIs section has the {string} heading")
	public void the_home_page_truist_ap_is_section_has_the_heading(String string) {
		if (homepage.verifyAPIcate_heading(string)) {
			System.out.println("verifyAPIcate_heading success");
		} else {
			System.out.println("verifyAPIcate_heading failed");
		}
	}

	@Then("the home page Truist APIs section has the {string}")
	public void the_home_page_truist_ap_is_section_has_the(String string) {
		if (homepage.verifyAPICate_Subheading(string)) {
			System.out.println("verifyAPICate_Subheading success");
		} else {
			System.out.println("verifyAPICate_Subheading failed");
		}
	}

}
