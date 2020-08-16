package wrapperclasses;

import java.util.NoSuchElementException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import io.appium.java_client.MobileElement;


public class ActionsClass {
	
	public void clickElement(MobileElement element) throws Exception 
	{
		try{
			element.click();
			System.out.println(element+" is clicked");
		}
		catch(NoSuchElementException exception) { 
			
			System.out.println(element+" is not present");
			
		}
		catch(ElementNotVisibleException exception)
		{
			System.out.println(element+" is not visible");
		}
		catch(WebDriverException exception)
		{
			System.out.println("Webdriver Exception "+ element);
			
		}
	}

public void sendKeysElement(MobileElement element, String data) throws Exception 
	{
		try{
			element.sendKeys(data);
			System.out.println(element+" is enterd");
		}
		catch(NoSuchElementException exception) {
			
			System.out.println(element+" is not enterd");
			
			
		}
		catch(ElementNotVisibleException exception)
		{
			System.out.println(element+" is not enterd");
			
		}
		catch(WebDriverException exception)
		{
			System.out.println("Webdriver Exception "+ element);
			
		}
		
	}

public void verifyEnabled(MobileElement element) throws Exception 
{
try{
	Assert.assertEquals(!element.isEnabled(), false);
	System.out.println(element+" is not Enabled");
	
}
catch(AssertionError exeception)
{
	System.out.println("Assertion Error");
}
catch(NoSuchElementException exception) {
	
	System.out.println(element+" is Enabled");
	
}
catch(ElementNotVisibleException exception)
{
	System.out.println(element+" Enabled");

}
catch(WebDriverException exception)
{
	System.out.println("Webdriver Exception "+ element);
}
}

}
