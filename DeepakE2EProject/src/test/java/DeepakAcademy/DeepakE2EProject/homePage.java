package DeepakAcademy.DeepakE2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.landingPage;
import pageObjects.loginPage;
import resources.Base;

public class homePage extends Base {
	
	@Test(dataProvider="testData")
	public void basePageNavigation(String email, String pwd, String url) throws IOException
	{
		WebDriver driver=initializeDriver();
		driver.manage().deleteAllCookies();
		driver.get(url);
		log.debug("url Launched");

		landingPage lp=new landingPage(driver);
		log.debug("clicking on login ");

		lp.getLogin().click();
		loginPage loginP=new loginPage(driver);
		
		log.debug("Entering username and email");

		loginP.emailbox().sendKeys(email);
		loginP.pwdbox().sendKeys(pwd);
		loginP.loginButton().click();
		
	}
	
	
	@DataProvider
	public Object[][] testData()
	{
		Object[][] test=new Object[2][3];
		
		test[0][0]="deepak.dm@tcs.com";
		test[0][1]="pwd@123";
		test[0][2]="http://www.qaclickacademy.com";
		
		test[1][0]="deepakdm2016@gmail.com";
		test[1][1]="pwdd@123";
		test[1][2]="http://www.qaclickacademy.com";
		return test;
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		driver=null;
	}
	
}
