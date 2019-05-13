import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_webparticipant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//webdriver.gecko.driver
		//webdriver.ie.driver

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.169.205.211:8080/web-participant-tracker/");
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());//if landed on current url, 
		
		driver.findElement(By.xpath("//input[@value='Add Participant']")).click();

		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("DeepakDM");
		WebElement radio=driver.findElement
				(By.xpath("//input[@value='male']"));
		radio.click();
		driver.findElement(By.xpath("//input[@value='save']")).click();
		
		//driver.close();//closes current browser opened with selenium, ie in focus
		//driver.quit();//closes all windows opened by seleium. Child winndows
	
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
*   //tagname[@Attribute='value'] ---> For xpath selector
*   tagname[attribute='value'] ---> for Css selector
*   tagname=value --css
*   tagname#id--css
*   tagname.classname -- css
*/