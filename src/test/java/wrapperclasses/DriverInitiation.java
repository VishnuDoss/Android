package wrapperclasses;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;



public class DriverInitiation {
	
	
	public static AppiumDriver<MobileElement> driver;
	@BeforeSuite
	public static AppiumDriver<MobileElement> setup() {
	
	String appPath = "C:\\Users\\Vishnu\\eclipse-workspace\\Android\\src\\test\\resources\\app-uat.apk";			
	DesiredCapabilities caps = new DesiredCapabilities();	
	 
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel1");
	caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
	caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2"); 
	caps.setCapability(MobileCapabilityType.APP, appPath);	
	caps.setCapability("appPackage", "com.olam.digital.ot.uat");
	caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
	caps.setCapability(MobileCapabilityType.FULL_RESET, true);
	caps.setCapability("appWaitActivity","*.AuthenticatorActivity");
	caps.setCapability("newCommandTimeout", 45000);	

	
	
	
	try {
		driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), caps);
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}		
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
	System.out.println("App Launched .. !!");
	
	return driver;

	}

}
