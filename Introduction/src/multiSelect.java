import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelect {

	
	public static void main(String v[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.plus2net.com/html_tutorial/html_frmddl.php");
		Select select=new Select(driver.findElement(By.xpath("(//select[@name='ddl']) [2]")));
		select.selectByIndex(0);
		select.selectByIndex(1);
		select.selectByIndex(2);
		
	}
}
