package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//rahulonlinetutor@gmail.com
public class LoginPage {

	
	public WebDriver driver;
	By loginMain=By.xpath("//*[@id='header']/nav/div/div[2]/div/ul[2]/li[1]/a[1]");
	By username=By.xpath("//*[@id='main']/div/div/div[2]/div/div/form/div[1]/input");
	By password=By.xpath("//*[@id='main']/div/div/div[2]/div/div/form/div[2]/input");

	By login=By.cssSelector("[type='submit']");
	By forgotPassword = By.cssSelector("[href*='https://phptravels.com/blog/forgot-password']");
	

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement getLoginMain()
	{
		return driver.findElement(loginMain);
	}

	
	public WebElement getUsername()
	{
		return driver.findElement(username);
	}
	

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}

	
}
