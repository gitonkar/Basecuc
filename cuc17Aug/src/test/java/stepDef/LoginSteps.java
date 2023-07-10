package stepDef;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginSteps {

	LoginPage page = new LoginPage();

	@Given("User is able to load {string} and validate basic details")
	public void user_is_able_to_load_and_validate_basic_details(String url, DataTable dataTable) {
		if (page.launchUrl(url)) {
			System.out.println("url launched success..!");
		} else {
			System.out.println("failed to launch url");
		}

		List<String> validation = new ArrayList<String>();
		validation = dataTable.asList();

		// Printing data table
		for (String string : validation) {
			System.out.println(string);
		}

	}

	@When("User login with {string} and {string}")
	public void user_login_with_and(String userid, String pass) throws InterruptedException {
		if (page.loginUser(userid, pass)) {
			System.out.println("url launched success..!");
		} else {
			System.out.println("failed to launch url");
		}

	}

	@Then("User is on home page")
	public void user_is_on_home_page() {

	}

}
