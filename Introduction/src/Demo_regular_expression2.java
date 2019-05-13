import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_regular_expression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// webdriver.gecko.driver
		// webdriver.ie.driver

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Multiple Windows")).click();

		driver.findElement(By.cssSelector("a[href*='windows']")).click();

		Set<String> abc = driver.getWindowHandles();

		Iterator<String> it = abc.iterator();

		String parentWindow = it.next();

		driver.switchTo().window(it.next());

		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

		driver.switchTo().window(parentWindow);

		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

	}

}

/*
 * locators supported by selenium webdriver ID ClassName linkText Name Xpath Css
 * 
 * 
 * right click copy xpath paste Firepath depricated in latest browsers when
 * xpath starts with html, not reliable no direct way to get css in firefox
 * $x(//*[@id="pass"]) for validating xpath ie $x
 * 
 */

/*
 * customized xpath //tagname[@Attribute='value']
 * 
 * xpath syntax regular expression //tagName[contains(@attribute,'value')]
 * 
 * css syntax regular expression tagName[attribute*='value'] -
 * 
 * xpath syntax regular expression //tagName[contains(@attribute,'value')]
 */