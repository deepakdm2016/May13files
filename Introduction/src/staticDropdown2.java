import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Select select=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		
		select.selectByIndex(3);
		select.selectByValue("AED");
		select.selectByVisibleText("INR");
		select.deselectByIndex(3);
		
		for(int i=0;i<10000;i++)
		{
		
			try{
			Thread.sleep(1000);
			select.selectByIndex(i);
			String text = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText();
			System.out.println(text);
			}
			catch(NoSuchElementException e)
			{
				e.printStackTrace();
				break;
			}
		}
		driver.quit();

	}

}
