import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		for(int i=0;i<20000;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();

			if(i>=8)
			{
				driver.switchTo().alert().accept();
				break;
			}

			
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(10000);
		driver.quit();

	}

	
	
}
