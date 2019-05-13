package stepDefinations;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions extends base {

	 public static Logger log =LogManager.getLogger(base.class.getName());
		
    @Given("^Initialize browser with chrome$")
    public void initialize_browser_with_chrome() throws Throwable {
    	
		 driver =initializeDriver();

        
    }

    @When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and log in $")
    public void user_enters_something_and_something_and_log_in(String strArg1, String strArg2) throws Throwable {
    	LoginPage lp=new LoginPage(driver);
		lp.getEmail().sendKeys(strArg1);
		lp.getPassword().sendKeys(strArg2);
		log.info(strArg2);
		        
    }

    @Then("^verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
        
    }

    @And("^Navigae to \"([^\"]*)\" site$")
    public void navigae_to_something_site(String strArg1) throws Throwable {
		driver.get(prop.getProperty(strArg1));
    }

    @And("^click on sign login link to land on secure sign in page$")
    public void click_on_sign_login_link_to_land_on_secure_sign_in_page() throws Throwable {

    	LandingPage l=new LandingPage(driver);
		l.getLogin().click();

			
    }


}
