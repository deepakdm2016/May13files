import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_regular_expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//webdriver.gecko.driver
		//webdriver.ie.driver

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediff.com");
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());//if landed on current url, 
		
		driver.findElement(By.cssSelector("a[title*='Sign']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("hello");
		
		driver.findElement(By.cssSelector("#password")).sendKeys("hello");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		
		
			
	//classes should not have spaces. Compound classes not accepted
		//use elements and index concept
	}

}

/* locators supported by selenium webdriver
 * ID
 * ClassName
 * linkText
 * Name
 * Xpath
 * Css
 * 
 * 
 * right click copy xpath paste
 * Firepath depricated in latest browsers
 * when xpath starts with html, not reliable
 * no direct way to get css in firefox
 * $x(//*[@id="pass"]) for validating xpath ie $x
 * 
 */


/*
* customized xpath
*   //tagname[@Attribute='value']
* 
* xpath syntax regular expression
*   //tagName[contains(@attribute,'value')]
* 
* css syntax regular expression
*   tagName[attribute*='value'] - 
*   
*   xpath syntax regular expression
*   //tagName[contains(@attribute,'value')] 
*/