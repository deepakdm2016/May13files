package stepDefination1;

import org.junit.Assert;
import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

	@Given("User is on landing page")
	public void user_is_on_landing_page() {

		System.out.println("User is on landing page");
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application_with_something_and_something(String strArg1, String strArg2)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user login into application with username and password");
		System.out.println(strArg1 + " LoggedIn");
	}

	@Then("Home page is populated")
	public void home_page_is_populated() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Home page is populated");

	}

	@And("^Cards are displayed \"([^\"]*)\"$")
	public void cards_are_displayed_something(String strArg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed ");
		Assert.assertTrue(true);
		System.out.print(strArg1);
	}

}
