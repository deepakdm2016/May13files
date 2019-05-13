import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//webdriver.gecko.driver
		//webdriver.ie.driver

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

		

	}

}
