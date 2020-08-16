package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import wrapperclasses.ActionsClass;

public class LogIn extends ActionsClass {
	
	public LogIn(WebDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	@AndroidFindBy(id="accountName")
	MobileElement enumerator;
	
	@AndroidFindBy(id="login_consent")
	MobileElement agreemnet;
	
	@AndroidFindBy(id="submit")
	MobileElement loginSubmit;
	
	public void enumerator(String enumeratorid) throws Exception {
	sendKeysElement(enumerator, enumeratorid);
	}
	
	public void agreement() throws Exception {
	clickElement(agreemnet);
	}
	
	public void loginSubmit() throws Exception {
	clickElement(loginSubmit);
	}
	
	
	
	

}
