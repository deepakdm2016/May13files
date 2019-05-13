package Academy.Project;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {

	@Test(dataProvider="getData")
	
	public void basePageNavigation(String un, String pass, String text ) throws IOException {

		driver = initializeDriver();
		
		driver.get(prop.getProperty("url"));

		LandingPage l = new LandingPage(driver);
		l.getLogin().click();

		LoginPage login = new LoginPage(driver);
		login.getEmail().sendKeys(un);
		login.getPass().sendKeys(pass);
		
		System.out.println(text);
		login.getLoginInButton().click();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		
		Object[][] data=new Object[2][3];
		
		data[0][0]="abc@qw.com";
		data[0][1]="123456";
		data[0][2]="Resticted_user";
		
		data[1][0]="1abc@qw.com";
		data[1][1]="2_123456";
		data[1][2]="Non_Resticted_user";
		
		return data;
	}
	
	@AfterTest
	public void tearDown(){

	}

}
