package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	
	public WebDriver driver;
	
	By forgotPswd = By.cssSelector("[class='link-forget']");
	By email=By.cssSelector("[name='email']");
	By resetPassword=By.cssSelector("[type='submit']");
	
	
	
	
	
	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getResetPassword()
	{
		return driver.findElement(resetPassword);
	}
	
	public WebElement getForgotPswd()
	{
		return driver.findElement(forgotPswd);
	}

	
	
}
