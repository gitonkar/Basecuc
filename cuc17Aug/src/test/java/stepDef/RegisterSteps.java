package stepDef;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;
import page.RegisterPage;

public class RegisterSteps {

	RegisterPage page = new RegisterPage();
	LoginPage login = new LoginPage();

	@Given("user is on {string} Home page")

	public void user_is_on_home_page(String string) {
		login.launchUrl(string);
	}

	@When("User able to click on Register button")
	public void user_able_to_click_on_register_button() {

	}

	@Then("User able to navigate on Create an account")
	public void user_able_to_navigate_on_create_an_account() {
		page.createAccount();
	}

	@And("User able to enter create accoutn details")
	public void user_able_to_enter_create_accoutn_details(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> userlist = dataTable.asLists(String.class);
		page.registerUser(userlist);

	}

	@Then("User able to click on submit button")
	public void user_able_to_click_on_submit_button() {

	}

}
