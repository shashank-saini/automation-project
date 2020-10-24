package Academy;

import java.io.IOException;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.HomePg;
import pageObjects.LoginPage;
import resources.base;

public class AppIntegrationTest extends base {
	public WebDriver driver;
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}
	@Test(dataProvider="getData")
	
	public void LoginPageNavigation(String Username,String email,String Password) throws Exception
	{
	
	
	LoginPage lg = new LoginPage(driver);
	lg.getLoginMain().click();
	//Forgot password
	ForgotPassword fp= new ForgotPassword(driver);
	fp.getEmail().sendKeys(email);
	fp.getResetPassword().click();
	//Login as registered user
	lg.getUsername().sendKeys(Username);
	lg.getPassword().sendKeys(Password);
	lg.getLogin().click();
	}
	public void WhatsAppNavigation()
	{
	 HomePg hp= new HomePg(driver);
	    hp.getReadMore().click();
	    
	    hp.getWhatsapplink().click();
	    String parent = driver.getWindowHandle();
	    
	    Set<String> s =driver.getWindowHandles();
	    java.util.Iterator<String> i= s.iterator();
	    while(i.hasNext())
	    {
	    	String child = i.next();
	    	
	    	if(!parent.equals(child))
	    	{
	    	driver.switchTo().window(child);

	    	System.out.println(driver.switchTo().window(child).getTitle());

	    	driver.close();
	    	}
	    }
	    	driver.switchTo().window(parent);

}
	@AfterTest
	public void teardown()
	{
		
		driver.close();
	
		
	}

	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test
		
		// Array size is 2
		// 0,1
		Object[][] data=new Object[2][3];
		//0th row
		data[0][0]="shain4bb3dlslw_sks";
		data[0][1]="rksyf4tdwls3@gmail.com";
		data[0][2]="Password@123";

		//1st row
		data[1][0]="shawggydts43a_ss";
		data[1][1]="shaywijd4s3alt@gmail.com";
		data[1][2]= "Password@123";

		
		return data;
		
		
	}
   

}
