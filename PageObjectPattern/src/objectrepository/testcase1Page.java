package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testcase1Page {

	
	WebDriver driver;
	//Constructor
	public testcase1Page(WebDriver driver) {
		this.driver = driver;
		}

	By countries = By.xpath("//input[@class='inputs ui-autocomplete-input']");
	By search = By.xpath("//input[@value='radio1']");
	By home = By.xpath("//button[contains(text(),'Home')]");
	public WebElement editbox()
	{
		return driver.findElement(countries);
	}
	

	public WebElement radiobutton()
	{
		return driver.findElement(search);
	}
	
	public WebElement homelink()
	{
		return driver.findElement(home);
	}
	
	
	
	
}
