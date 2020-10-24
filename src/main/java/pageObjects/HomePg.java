package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePg {
	public WebDriver driver;
	
		By readMore = By.xpath("//*[@id=\"main\"]/div/div/div[1]/div/div[1]/div/div[1]/div[2]/div[2]/a");
		
		By whatsappLink = By.cssSelector("[href*='https://wa.me/923311442244?fbclid=IwAR3kaBdYNsjh2KS4G7KtLNMKWPAQI16Jelgl0CjcQw9Dl2E4zcTxvPGbHlY']");

        By title= By.cssSelector("[href*='https://web.whatsapp.com/']");
        
		public HomePg(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
			this.driver=driver;
			
		}

		public WebElement getReadMore()
		{
			return driver.findElement(readMore);
		}
		public WebElement getWhatsapplink()
		{
			return driver.findElement(whatsappLink);
		}
		public WebElement getTitle()
		{
			return driver.findElement(title);
		}
}
