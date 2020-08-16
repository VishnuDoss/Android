package testclasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.LogIn;
import wrapperclasses.DriverInitiation;

public class LoginTest extends DriverInitiation{
	
	@Test(dataProvider ="enumeratordetails")
	public void login(String enumeratorid ) throws Exception
	{
		LogIn l=new LogIn(driver);
		l.enumerator(enumeratorid);
		l.agreement();
		l.loginSubmit();
	}
	
	@DataProvider(name = "enumeratordetails")
	public static Object[] enumeratordetails(){
		return new Object[] {"3247553"};
		
	}
	
	

}
