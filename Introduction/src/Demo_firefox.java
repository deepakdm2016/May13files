import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//webdriver.gecko.driver
		//webdriver.ie.driver

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Deepak\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		driver.manage().window().setPosition(new Point(0,-2000));
		
		driver.quit();
	}

}
