import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();



		driver.get("http://the-internet.herokuapp.com/");



		driver.findElement(By.linkText("Nested Frames")).click();



		driver.switchTo().frame("frame-top");



		driver.switchTo().frame("frame-middle");

		

		System.out.println(driver.findElement(By.id("content")).getText());			}

}
