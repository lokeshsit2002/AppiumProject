import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class ScrollDemo extends Base {

	public static void main(String[] args) throws MalformedURLException {

		// TODO Auto-generated method stub
				AndroidDriver<AndroidElement> driver=capabilities();
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			     driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
			 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
			     
			     
	}
}
