import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridBase {
	
	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException{

		AndroidDriver<AndroidElement>  driver;

		// TODO Auto-generated method stub
	 File appDir = new File("src");
     File app = new File(appDir, "ApiDemos-debug.apk");
     DesiredCapabilities capabilities = new DesiredCapabilities();
     
  //   capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_28");
     if(device.equals("real"))
         capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
         else
             capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_28");
     capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
     capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
         
    driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    
    return driver;
	}

}
