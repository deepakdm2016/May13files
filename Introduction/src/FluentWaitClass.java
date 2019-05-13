import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait; //FluentWait is a Class and it is a part of this package
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FluentWaitClass {
	@Test
	public static void fluentWaitMethod(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("#start button")).click();
			
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	       .withTimeout(10, TimeUnit.SECONDS)
	       .pollingEvery(3, TimeUnit.SECONDS)
	       .ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(By.cssSelector("#finish h4"));
				String getTextOnPage = element.getText();
				if(getTextOnPage.equals("Hello World!")){
					System.out.println(getTextOnPage);
					return element;
				}else{
					System.out.println("FluentWait Failed");
					return null;
				}
			}
		});
	}
}