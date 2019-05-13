package introduction;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
public class gestures_swipe extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//scroll until we see the view element
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		WebElement xpandable=driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		xpandable.click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
		
		driver.findElementByXPath("//*[@content-desc='9']").click();

		//driver.findElementByAndroidUIAutomator("text(\"hh\")")
		
		
		//swipe example
		TouchAction t=new TouchAction(driver);
		WebElement first=driver.findElementByXPath("//*[@content-desc='15']");
		WebElement last=driver.findElementByXPath("//*[@content-desc='45']");

		t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(last)).release().perform();
		


			}


	}

