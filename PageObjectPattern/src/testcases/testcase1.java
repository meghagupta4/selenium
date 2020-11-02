package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.testcase1Page;
import objectrepository.testcase1Page2;
import objectrepository.testcase1Page3;

public class testcase1 {

@Test
public void loginapp()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\212704032\\Downloads\\Selenium\\chromedriver_win32\\chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	
	testcase1Page obj = new testcase1Page(driver);
	obj.editbox().sendKeys("India");
	obj.radiobutton().click();
	obj.homelink().click();   //This will open new page
	
	testcase1Page2 obj2 = new testcase1Page2(driver);
	obj2.registerlink().click();
	
	testcase1Page3 obj3 = new testcase1Page3(driver);
	obj3.enterusername().sendKeys("rahulshettyacademy");
	obj3.enteremail().sendKeys("meghagupta4@gmail.com");
	
	
}


}

