package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

public WebDriver driver;
	By registerMain=By.xpath("//*[@id=\"header\"]/nav/div/div[2]/div/ul[2]/li[2]/a");
	By username=By.cssSelector("[name='username']");
	By email=By.cssSelector("[name='email']");
	By password=By.cssSelector("[name='password']");
	By confirmPassword=By.cssSelector("[name='confirm_password']");
	By icon =By.cssSelector("[class='icon-check']");
	By errorMsg= By.cssSelector("[class='error-message']");
	By submit=By.cssSelector("[type='submit']");
	
	By dropdown = By.cssSelector("[class='icon-arrow-down']");
	By aboutMe = By.cssSelector("[name='about_me']");
	By saveChanges= By.cssSelector("[value='update']");
	By profile = By.xpath("//*[@id=\"header\"]/nav/div/div[2]/div/ul[2]/li[1]/ul/li[1]/a");
	By validateUser = By.cssSelector("[class='username']");
	By logout = By.cssSelector("[href*='https://phptravels.com/blog/logout']");
	By profileTitle = By.cssSelector("[class='page-title']");
	
	public RegistrationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public  WebElement getRegisterMain()
	{
		return driver.findElement(registerMain);
		
	}
	
	public  WebElement getUsername()
	{
		return driver.findElement(username);
		
	}

	public  WebElement getEmail()
	{
		return driver.findElement(email);
		
	}

	public  WebElement getPassword()
	{
		return driver.findElement(password);
		
	}
	
	public  WebElement getConfirmPassword()
	{
		return driver.findElement(confirmPassword);
		
	}
	
	public  WebElement getIcon()
	{
		return driver.findElement(icon);
		
	}

	public  WebElement getSubmit()
	{
		return driver.findElement(submit);
		
	}

	public  WebElement getDropdown()
	{
		return driver.findElement(dropdown);
		
	}
	public  WebElement getAboutMe()
	{
		return driver.findElement(aboutMe);
		
	}
public  WebElement getSaveChanges()
{
	return driver.findElement(saveChanges);
	
}
public  WebElement getErrorMsg()
{
	return driver.findElement(errorMsg);
	
}
public  WebElement getLogout()
{
	return driver.findElement(logout);
	
}
public WebElement getProfile()
{
	return driver.findElement(profile);
}
public WebElement getValidateUser()
{
	return driver.findElement(validateUser);
}
public WebElement getProfileTitle()
{
	return driver.findElement(profileTitle);
}
}