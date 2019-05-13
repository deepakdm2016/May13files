package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	WebDriver driver;
	By username=By.id("login1");
	By pwd=By.id("password");
	By submit=By.xpath("//input[@type='submit']");
	By link=By.linkText("Home");
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
			
	public WebElement getUserName()
	{
		return driver.findElement(username);
	}
	
	public WebElement getPwd()
	{
		return driver.findElement(pwd);
	}

	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
	public WebElement link()
	{
		return driver.findElement(link);
	}
	
}

