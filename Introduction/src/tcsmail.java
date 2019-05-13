import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tcsmail {

	public static void main(String v[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Set<Cookie> cooki=driver.manage().getCookies();
		Iterator<Cookie> it=cooki.iterator();

		while(it.hasNext())
		{
			Cookie a= (Cookie)it.next();
			System.out.println(a.getName());
			driver.manage().addCookie(a);
		}
		driver.get("https://myapp.tcs.com/vpn/index.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Enter user name']")).sendKeys("389524");
		//input[@id='Enter user name']
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Vinayaka@2019");
		//input[@id='Enter user name']
		driver.findElement(By.xpath("//input[@id='Log_On']")).click();
		
		
		
		Set<String> ab=driver.getWindowHandles();
		
		
	}
}
