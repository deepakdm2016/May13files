import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//webdriver.gecko.driver
		//webdriver.ie.driver

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.manage().window().setPosition(new Point(0,-2000));
		
		
		try{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='ql']"));
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Important: This exception will be thrown on reaching max time outs");
			e.printStackTrace();
		}
		
		WebDriverWait w=new WebDriverWait(driver,15);
		
		w.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//input[@name='ql']"))));
		
		System.out.println(driver.getCurrentUrl());//if landed on current url, 
		driver.get("http://yahoo.com");
		driver.navigate().back();
		
		driver.get("http://facebook.com");
		
		
		//driver.findElement(By.id("email")).sendKeys("dipud_m@yahoo.co.in");
		driver.findElement(By.cssSelector("#email")).sendKeys("dipud_m@yahoo.co.in");
		
		driver.findElement(By.name("pass")).sendKeys("38954");
		
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		
		System.out.println(
		driver.findElement(By.xpath("//*[@id='globalContainer']/div[3]/div/div/div")).getText());
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		driver.close();//closes current browser opened with selenium, ie in focus
		driver.quit();//closes all windows opened by seleium. Child winndows
	
	//classes should not have spaces. Compound classes not accepted
		//use elements and index concept
		
		/*
		 * Evey object may not have ID, className or name- Xpath and CSS Preferred
Alpha numeric id may vary on every refresh- check
Confirm the link object with anchor "a" tag
Classes should not have spaces- Compound classes cannot be accepted
Multipl values - Selenium identifies the first one- Scans from top left
Double quotes inside double quotes are not accepted
Xpath/CSS  can be defined in n number of ways
Rightclick copy on blue highlighted html code to generate xpath
Firepath depreciated from firefox- 
when xpath starts with html-Not reliable- Switch browser to get another one
There is no direct way to get CSS in chrome. You will find it in tool bar
Degrade browser to less firefox 55 to ge Firepath
$("") - for css ,    $x("")   or xpath
//tagName[@attribute='value']  - xpath syntax
tagName[attribute='value']  -CSS  tagName#id- CSS   tagname.classname- CSS
//tagName[contains(@attribute,'value')]  - xpath regular expression
tagName[Atrribute*='value'] - Css regular expression

		 * 
		 */
		
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
*   
*   absolute - relative
*   /following-sibling::li[2], /parent::ul
*   traversing from parent child
*	with text - //*[text()=' Selenium']
*   
*/