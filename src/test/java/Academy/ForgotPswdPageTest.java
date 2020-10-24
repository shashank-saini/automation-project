package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import resources.base;

public class ForgotPswdPageTest extends base{
	public WebDriver driver;
	
	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}
	@Test(dataProvider="getData")
	
	public void ForgotPswdPageNavigation(String email) throws Exception
	{
	//Forgot password
	ForgotPassword fp= new ForgotPassword(driver);
	fp.getForgotPswd();
	fp.getEmail().sendKeys(email);
	fp.getResetPassword().click();
	
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
		Object[][] data=new Object[0][1];
		//0th row
		
		data[0][1]="sks123@gmail.com";
		
		//1st row
		
		data[0][1]="laddduuuu@gmail.com";
		
		
		return data;
		
		
	}
	
}