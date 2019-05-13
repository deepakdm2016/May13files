import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexercises2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");

		WebElement table = driver.findElement(By.id("product"));
		int rowcount = table.findElements(By.tagName("tr")).size();
		int columncount = table.findElements(By.tagName("th")).size();
		System.out.println(rowcount);
		System.out.println(columncount);

		List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		for (int i = 0; i < 2; i++) {
			System.out.println(secondrow.get(i).getText());
		}
	}

}