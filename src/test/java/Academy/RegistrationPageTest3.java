package Academy;

import java.io.IOException;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.HomePg;
import pageObjects.LoginPage;
import pageObjects.RegistrationPage;
import resources.base;

public class RegistrationPageTest3 extends base{
	public WebDriver driver;
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}
	@Test(dataProvider="getData")
	
	public void RegistrationPageNavigation(String Username,String email,String Password, String text) throws Exception
	{
		// creating object to that class and invoke methods of it
		driver.get(prop.getProperty("url"));
		
		// Registering new User
		RegistrationPage rg =new RegistrationPage(driver);
		rg.getRegisterMain().click();
		rg.getUsername().sendKeys(Username);
		rg.getEmail().sendKeys(email);
		rg.getPassword().sendKeys(Password);
		rg.getConfirmPassword().sendKeys(Password);
	    rg.getIcon().click();;
		rg.getSubmit().submit();
//		if(rg.getErrorMsg().equals("The Username field must be at least 4 characters in length.")) 
//			{   foobar(Username);
//		    }
//	    else {
//	        throw new Exception("Something bad happened.");
//	    };
		
		//LSave changes and validate user
		rg.getAboutMe().sendKeys(text);
		rg.getSaveChanges().click();
		rg.getDropdown().click();
		rg.getProfile().click();
		String user = rg.getValidateUser().getText();
		Assert.assertEquals(user, Username);
		rg.getDropdown().click();
		rg.getLogout().click();

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
		Object[][] data=new Object[2][4];
		//0th row
		data[0][0]="shain4bb3dlslw_sks";
		data[0][1]="rksyf4tdwls3@gmail.com";
		data[0][2]="Password@123";
		data[0][3]="First User";
		//1st row
		data[1][0]="shawggydts43a_ss";
		data[1][1]="shaywijd4s3alt@gmail.com";
		data[1][2]= "Password@123";
		data[1][3]= "Second user";
		
		return data;
		
		
	}
	
}
