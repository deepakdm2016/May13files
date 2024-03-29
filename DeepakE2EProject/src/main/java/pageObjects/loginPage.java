package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	WebDriver driver;
	
	By email=By.xpath("//input[@id='user_email']");
	By pwd=By.xpath("//input[@id='user_password']");
	By loginButton=By.xpath("//input[@name='commit']");
	
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement emailbox()
	{
		return driver.findElement(email);
	}

	public WebElement pwdbox()
	{
		return  driver.findElement(pwd);
	}
	
	public WebElement loginButton()
	{
		return  driver.findElement(loginButton);
	}
	
	
}
