import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.*;
public class checkbox2 {

	public static void main(String v[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		int count = checkboxes.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {

			Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		}
		
	}
	
	//Assert.assertEquals(actual text, expected text)
	//Assert.assertTrue
	//Assert.assertFalse
}
