package BaseSetup;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Setup {
	public static AndroidDriver<MobileElement> driver;

	public void set_up()    {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Galaxy Tab A (8.0\", 2019)"); //For Registration Story
		caps.setCapability("deviceid", "R9CR203BFWJ"); //For Registration Story
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "10");
		caps.setCapability("skipUnlock","true");
//		caps.setCapability("appPackage", "com.test.dishisit");
//		caps.setCapability("appActivity","host.exp.exponent.MainActivity");
		caps.setCapability("noReset","true");
		caps.setCapability("fullReset","false");
		caps.setCapability("noSign","true");
		caps.setCapability("newCommandTimeout","30000");
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}

    public void tearDown(){
        driver.quit();
    }
}
