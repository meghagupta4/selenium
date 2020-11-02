import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class SampleTest {
	
	ExtentSparkReporter reporter;
	ExtentReports extent;
	
@BeforeMethod
public void config()

{
	String path = System.getProperty("user.dir")+"\\reports\\R1.html";
	reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Web Automation results");
	reporter.config().setDocumentTitle("Test Results");
	
	extent = new ExtentReports();
	extent.attachReporter(reporter);
}

@Test
public void prerequisit()
{   
	ExtentTest test = extent.createTest("prerequisit");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\212704032\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	System.out.println("Browser Opened");	
	System.out.println(driver.getTitle());
	
	test.fail("Results failed");
	extent.flush();

}

}

