package Demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test4 {

	@Test
	public void newTest()
	{
		System.out.println("newTest");
	}
	
	@Test
	public void newTest2()
	{
		System.out.println("newTest2");
	}
	
	
   @BeforeSuite(alwaysRun = true)
   public void before()
	{
		System.out.println("Before Suite - alwaysRun = true ");
	}
   
}
