import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.*;
public class checkbox {

	public static void main(String v[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption1")).click();
		
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		int count=driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(count);
		driver.quit();
	//Assert.assertEquals(actual text, expected text)
	//Assert.assertTrue
	//Assert.assertFalse
}
	
}
