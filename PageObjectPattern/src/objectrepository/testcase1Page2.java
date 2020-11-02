package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testcase1Page2 {

	
	WebDriver driver;
	//Constructor
	public testcase1Page2(WebDriver driver) {
		this.driver = driver;
		}

	By register = By.linkText("register");
	
	public WebElement registerlink()
	{
		return driver.findElement(register);
	}
	

	
	
	
	
	
}
