import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinkTest {

	public static void main(String v[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");

		List<WebElement> li = driver.findElements(By.tagName("a"));

		for (WebElement element : li) {
			String url = element.getAttribute("href");
			int responseCode = 0;

			try {
				HttpURLConnection openConnection = (HttpURLConnection) new URL(url).openConnection();

				responseCode = openConnection.getResponseCode();
			} catch (IOException e) {
				System.out.println("Broken Link " + url);
				e.printStackTrace();
			}
			if(responseCode>400)
				System.out.println("Broken Link "+url);
		}

	}
}
