package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class params {
	
	@Parameters({"url"})
	@Test
	public void prerequisit(String str)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\212704032\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(str);
		driver.manage().window().maximize();
		System.out.println("Browser Opened");	
	
	}

}
