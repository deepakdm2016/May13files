package stepDefinations;



@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {

    System.out.println("Login to landing page");
    }


    @When("^user login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {

    System.out.println("Logged in with "+ strArg1 + " and "+ strArg2);
    }
    
    @Then("^home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("Login to home page");
       
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        System.out.println("cards are displayed");

    }

}
