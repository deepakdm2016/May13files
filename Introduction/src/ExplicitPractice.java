import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitPractice {

	public static void main(String v[]) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		//System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
		WebDriverWait w=new WebDriverWait(driver,20);
		//w.findElement(By.xpath("//div[@id='results']");
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());

		driver.close();
	}
}
