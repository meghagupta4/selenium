package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testcase1PageObjectFactory {

	
	WebDriver driver;
	//Constructor
	public testcase1PageObjectFactory(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(Webdriver driver, Object page);
		PageFactory.initElements(driver, this);
	
		}

	//By countries = By.xpath("//input[@class='inputs ui-autocomplete-input']");
	//By search = By.xpath("//input[@value='radio1']");
	//By home = By.xpath("//button[contains(text(),'Home')]");
	
	@FindBy(xpath="//input[@class='inputs ui-autocomplete-input']")
	WebElement countries;
	
	@FindBy(xpath="//input[@value='radio1']")
	WebElement search;
	
	@FindBy(xpath="//button[contains(text(),'Home')]")
	WebElement home;
	
	public WebElement editbox()
	{
		return countries;
	}
	

	public WebElement radiobutton()
	{
		return search;
	}
	
	public WebElement homelink()
	{
		return home;
	}
	
	
	
	
	
}
