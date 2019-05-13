import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class autoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Ban");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);

		
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("mys");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);

		
		
		
	}

}
