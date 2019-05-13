import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class scorecard {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22402/rcb-vs-mi-7th-match-indian-premier-league-2019");
		
		int count=driver.findElements(By.xpath("//body/div[@class='page']/div[@id='page-wrapper']/div[@class='cb-col cb-col-100 cb-bg-white']/div[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']/div[@id='innings_1']/div[1] //div[@class='cb-col cb-col-8 text-right text-bold']")).size();
		int sum=0;
		for(int i=1;i<count;i++)
		{
			String abc=(driver.findElements(By.xpath("//body/div[@class='page']/div[@id='page-wrapper']/div[@class='cb-col cb-col-100 cb-bg-white']/div[@class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']/div[@id='innings_1']/div[1] //div[@class='cb-col cb-col-8 text-right text-bold']")).get(i).getText());
			int s=Integer.parseInt(abc);
			System.out.println(s);

			sum=sum+s;
		}
		int count1=driver.findElements(By.xpath("//div[@class='cb-col cb-col-8 text-bold cb-text-black text-right']")).size();
		int extras=0;
		String abc=(driver.findElements(By.xpath("//div[@class='cb-col cb-col-8 text-bold cb-text-black text-right']")).get(0).getText());
			int s=Integer.parseInt(abc);
			sum=sum+s;
		
		
		System.out.println(sum);
		//div[@class='cb-col cb-col-8 text-bold cb-text-black text-right']
		
		String total=driver.findElement(By.xpath("//div[@class='cb-col cb-col-8 text-bold text-black text-right']")).getText();
		int totalint=Integer.parseInt(total);
		Assert.assertTrue(totalint==sum);
		
	}

}
