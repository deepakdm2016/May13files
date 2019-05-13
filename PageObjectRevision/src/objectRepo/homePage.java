package objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

	
	WebDriver driver;
	
	//important variables are WebElement and @FindBy(xpath, id ...= "value")
	@FindBy(xpath=("//a[@href='https://www.rediff.com/news']"))
	WebElement news;
	
	
	
	
	public homePage(WebDriver driver)
	{
		this.driver=driver;
		
		//this is an extra step in page factory model
		PageFactory.initElements(driver, this);
		
	}
	
	
	public WebElement news()
	{
		return news;
	}
	
	
}
