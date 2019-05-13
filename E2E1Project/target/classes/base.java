package resources;

import java.io.File;
import java.util.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException
	{
		//chroe, firefox, ie, safari - make it global
		prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Deepak\\Selenium\\E2E1Project\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else
		{
			driver=new FirefoxDriver();

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void screenshot(String res_name) throws IOException{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Deepak\\"+res_name+"screenshot.png"));
		
	}
	

}
