package test_functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepo.loginPage;

public class test1 {
	
	@Test
	public void testLogin()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
	loginPage a=new loginPage(driver);
	
	a.getUserName().sendKeys("DeepakDM");
	a.getPwd().sendKeys("deepakdm");
	a.submit().click();
	
	a.link().click();
	
	driver.quit();
}
}
