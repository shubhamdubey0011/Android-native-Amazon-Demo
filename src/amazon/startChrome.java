package amazon;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sun.jna.Platform;

public class startChrome 
{

public static void main(String[] args) throws MalformedURLException ,InterruptedException
{
	
	/*DesiredCapabilities capablities=DesiredCapabilities.android();
	capablities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
	capablities.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
    capablities.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID" );
    capablities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S4");
    capablities.setCapability(MobileCapabilityType.VERSION, "5.0.1");
     URL url = new  URL("http://127.0.0.1:4723/wd/hub");
     AppiumDriver driver = new AppiumDriver(url, capablities);
     driver.get("https://www.facebook.com/");*/
	
	
	
	DesiredCapabilities capabilitiesAndroid = new DesiredCapabilities();
	
	//real device code - native app 
    capabilitiesAndroid.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);
	capabilitiesAndroid.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
	capabilitiesAndroid.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID" );
	capabilitiesAndroid.setCapability(MobileCapabilityType.DEVICE_NAME, "9885f64b554a395742");
	capabilitiesAndroid.setCapability(MobileCapabilityType.VERSION, "6.0.1");	
   // WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilitiesAndroid);
	AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilitiesAndroid);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	
	
	//android emulator code web based 
	/*capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("deviceName","Android Emulator"); 
	capabilities.setCapability("browserName", "Browser");
	capabilities.setCapability("platformVersion", "4.4");  
	capabilities.setCapability("Android", true);
	RemoteWebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    driver.get("https://www.facebook.com/");
    System.out.println("successfulluy got the facebook homepage");*/

	
	
	
	
	
	
	
	
}
}
