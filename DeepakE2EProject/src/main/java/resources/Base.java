package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {

	public static WebDriver driver;

	public Logger log=LogManager.getLogger(Base.class.getName());
	public WebDriver initializeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				new File("C:\\Users\\Deepak\\Selenium\\DeepakE2EProject\\input.properties"));
		prop.load(fis);

		String browser = prop.getProperty("browser");

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
			driver = new ChromeDriver();
			log.debug("chrome Launched");
		}

		else if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Deepak\\geckodriver.exe");
			driver = new FirefoxDriver();
			log.debug("Firefox Launched");

		}
		
		else
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
			driver = new ChromeDriver();
			log.debug("ie Launched");

		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
		
		

	}
	
	
	public void screenShot(String string) throws IOException
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		log.info("screenshot taken "+ string+"screenShot.png");

	}
	
}
