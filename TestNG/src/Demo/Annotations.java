package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeTest
	public void prerequisit()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\212704032\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Before Test: placed in Annotations");	
	
	}
	
	@Test
	public void Login()
	{  
		System.out.println("Annotations: Login Done");	
	}
	
	@Test
	public void show()
	{
		System.out.println("Annotations:Performing actions");
	}
	
	@AfterTest
	public void postrequisit()
	{
		System.out.println("After Test : placed in Annotations");
	}
}
