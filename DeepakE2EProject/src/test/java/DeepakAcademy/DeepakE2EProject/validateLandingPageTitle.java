package DeepakAcademy.DeepakE2EProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.landingPage;
import pageObjects.loginPage;
import resources.Base;

public class validateLandingPageTitle extends Base {
	
	@Test
	public void basePageNavigation() throws IOException
	{
		WebDriver driver=initializeDriver();
		driver.manage().deleteAllCookies();
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				new File("C:\\Users\\Deepak\\Selenium\\DeepakE2EProject\\input.properties"));
		prop.load(fis);

		String url = prop.getProperty("url");
		driver.get(url);
		
		log.debug("Validating if title is present or not");

		landingPage lp=new landingPage(driver);
		String act=lp.getTitle().getText();
		Assert.assertEquals("FETURED COURSES", act);
		
			
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		driver=null;

	}
	
}
