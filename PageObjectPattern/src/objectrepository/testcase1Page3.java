package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testcase1Page3 {

	
	WebDriver driver;
	//Constructor
	public testcase1Page3(WebDriver driver) {
		this.driver = driver;
		}

	By username = By.xpath("//input[@id='user_name']");
	public WebElement enterusername()
	{
		return driver.findElement(username);
	}
	
	By email = By.xpath("//input[@id='user_email']");
	public WebElement enteremail()
	{
		return driver.findElement(email);
	}

	
	
	
	
	
}
