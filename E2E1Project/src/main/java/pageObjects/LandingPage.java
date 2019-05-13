package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	By signin = By.cssSelector("a[href*='sign_in']");
	By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
	By NavBar=By.xpath("//a[contains(text(),'Contact')]");
	public LandingPage(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement getLogin() {
		return driver.findElement(signin);

	}
	
	public WebElement getTitle() {
		return driver.findElement(title);

	}
	
	public WebElement getLink()
	{
		return driver.findElement(NavBar);
		
	}

}
