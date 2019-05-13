package Academy.Project;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class validateTitle extends base {

	
	public static org.apache.logging.log4j.Logger log=org.apache.logging.log4j.LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get("http://qaclickacademy.com");
		log.info("Chrome driver is initialized");

	}
	
	@Test
	
	public void validateText() throws IOException {

		
		LandingPage l = new LandingPage(driver);
		log.info("Navigated to home page");
		
		//Assert.assertTrue(l.getLink().isDisplayed());
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		log.info("Test is successfully executed");

	}
	
	@AfterTest
	public void tearDown(){

		
	}
	
	
}
