import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.sourceforge.htmlunit.corejs.javascript.Script;

public class handleFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/recaptcha/api2/demo");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		String script="return document.getElementById(\"input1\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		
		
		String script1="return document.getElementById(\"input2\").value;";
		String text1=(String) js.executeScript(script1);
		System.out.println(text1);
		
		String script2="return document.getElementById(\"input3\").value;";
		String text2=(String) js.executeScript(script2);
		System.out.println(text2);
		
		String script3="return document.getElementById(\"option1\").value;";
		String text3=(String) js.executeScript(script3);
		System.out.println(text3);
		
		
		String script4="return document.getElementsByClassName(\"recaptcha-checkbox-checkmark\").click();";
		WebElement text4=(WebElement) js.executeScript(script4);
		
		Actions ab=new Actions(driver);
		ab.click(text4).build().perform();
		
		
		
		
		driver.close();
	}

}
