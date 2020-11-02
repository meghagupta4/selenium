package fileupload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {
	public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\212704032\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/upload");
	driver.findElement(By.xpath("//input[@id='file-upload']")).click();
	Thread.sleep(5000);
	Runtime.getRuntime().exec("C:\\Users\\212704032\\Downloads\\Selenium\fileupload.exe");
	

	}
}
