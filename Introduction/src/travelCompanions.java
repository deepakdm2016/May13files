import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Calendar;
import org.openqa.selenium.chrome.ChromeDriver;

public class travelCompanions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_date")).click();
		int count=driver.findElements(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom'] //*[@class='day']")).size();
		
		Calendar c=Calendar.getInstance();
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		dayOfMonth++;
		System.out.println(dayOfMonth);
				for(int i=0;i<count;i++)
		{
			String exp=driver.findElements(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom'] //*[@class='day']")).get(i).getText();
			System.out.println(exp);
			int expected=Integer.parseInt(exp);
			System.out.println("expected "+dayOfMonth);
			System.out.println("Actual "+expected);

			if(expected==dayOfMonth)
			{
				
				driver.findElements(By.xpath("//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom'] //*[@class='day']")).get(i).click();
				break;

			}
		}
	
	}

}
