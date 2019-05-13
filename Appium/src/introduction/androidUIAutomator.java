package introduction;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class androidUIAutomator extends base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.findElementByAndroidUIAutomator("text(\"OS\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"SMS Messaging\")").click();
		
		

	}

}
