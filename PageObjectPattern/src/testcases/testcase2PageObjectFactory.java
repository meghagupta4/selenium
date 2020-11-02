package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.testcase1PageObjectFactory;


public class testcase2PageObjectFactory {

@Test
public void loginapp()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\212704032\\Downloads\\Selenium\\chromedriver_win32\\chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	
	testcase1PageObjectFactory obj = new testcase1PageObjectFactory(driver);
	obj.editbox().sendKeys("India");
	obj.radiobutton().click();
	obj.homelink().click();   //This will open new page
	
	
}


}

