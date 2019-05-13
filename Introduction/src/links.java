import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		int xy=driver.findElements(By.tagName("a")).size();
		for(int i=0;i<xy;i++)
		{
			String a=driver.findElements(By.tagName("a")).get(i).getAttribute("href");
			System.out.println(a);
		}
		
		WebElement abc=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		int count1=abc.findElements(By.tagName("a")).size();
		for(int i=0;i<count1;i++)
		{
			System.out.println(abc.findElements(By.tagName("a")).get(i).getText());
			System.out.println(abc.findElements(By.tagName("a")).get(i).getAttribute("href"));
			
			abc.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
		}
		
		Thread.sleep(10000);
		Set<String> win=driver.getWindowHandles();
		Iterator its=win.iterator();
		while(its.hasNext())
		{
			
			driver.switchTo().window((String) its.next());
			System.out.println(driver.getTitle());
			
			
		}
		
		
driver.quit();
	}


}
