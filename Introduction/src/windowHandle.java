import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://gmail.com");
		
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
		
		Set<String> wds=driver.getWindowHandles();
		
		Iterator it=wds.iterator();
		String reqid=null;
		while(it.hasNext())
		{
			String id=(String) it.next();
			System.out.println(id);
			String a=driver.switchTo().window(id).getTitle();
			if(a.equals("Gmail"))
			{
				reqid=id;
			}
			System.out.println(a);
			
		}
		
		driver.switchTo().window(reqid).close();

	}

}
