package amazon;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class startApplication 
{
	//private static AndroidDriver driver;
	

   public static void main(String[] args) throws MalformedURLException, InterruptedException 
   {
   {
			//File classpathRoot = new File(System.getProperty("user.dir"));
			File appDir = new File("D:/Test_Fabric/AppiumDemo/Apps/Amazon","app-debug(8).apk");
			//File app = new File(appDir, "");

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("app", "Browser"); 
			capabilities.setCapability("deviceName", "9885f64b554a395742");
			capabilities.setCapability("platformVersion", "6.0.1");
			capabilities.setCapability("platformName", "Android");
			
			capabilities.setCapability("app", appDir.getAbsolutePath());
			capabilities.setCapability("appPackage", "com.comcast.watchablephone");
			capabilities.setCapability("appActivity", "com.comcast.watchablephone.activity.splash");
			capabilities.setCapability("appWaitActivity", ".activity.WelcomeScreenActivity");
		       capabilities.setCapability("appActivity", ".activity.Splash");
		       capabilities.setCapability("appWaitActivity", ".activity.Splash");

		    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			
			driver.findElement(By.id("com.comcast.watchablephone:id/Button_login")).click();
			driver.findElement(By.id("com.comcast.watchablephone:id/editText_username_email")).sendKeys("testvaltech2016@gmail.com");
			driver.findElement(By.id("com.comcast.watchablephone:id/editText_password")).sendKeys("testvaltech");
			driver.findElement(By.className("android.widget.Button[3]")).click(); 
			
		

	   
	  
	       
	     
	   
	   
}
}
}