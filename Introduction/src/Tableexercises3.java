import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexercises3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/web-table-element.php#");

		WebElement table = driver.findElement(By.className("dataTable"));
		List<WebElement> findElements = table.findElements(By.tagName("tr"));
		for (int i = 1; i < findElements.size(); i++) {

			if ((findElements.get(i).findElement(By.xpath("//tr[" + i + "]/td[" + 1 + "]")).getText())
					.equals("Varun Beverages Ltd.")) {
				for (int j = 1; j <= 5; j++) {

					System.out.println(driver.findElement(By.xpath("//th[" + j + "]")).getText());
					System.out.println(
							findElements.get(i).findElement(By.xpath("//tr[" + i + "]/td[" + j + "]")).getText());

				}
			}
		}

	}

}