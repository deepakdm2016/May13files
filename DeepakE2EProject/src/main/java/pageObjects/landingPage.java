package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	WebDriver driver;
	By login=By.xpath("//span[contains(text(),'Login')]");
	By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	By contact=By.xpath("//a[@href='contact.php']");
	
	public landingPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement getContact()
	{
		return driver.findElement(contact);
	}
}
