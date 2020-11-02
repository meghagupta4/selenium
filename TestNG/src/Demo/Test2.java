package Demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void test3()
	{
		System.out.println("test3");
	}
	
	@Test
	public void test4()
	{
		System.out.println("test4");
	}
	
	
   @BeforeSuite(alwaysRun = true)
   public void before()
	{
		System.out.println("Before Suite - alwaysRun = true ");
	}
   
   @AfterSuite
   public void Zafter()
	{
		System.out.println("After Suite 1");
	}
	
   @AfterSuite
   public void Aafter()
	{
		System.out.println("After Suite 2");
	}
   
   @BeforeMethod
   public void Bbefore()
   {
	   System.out.println("BBefore Method of Test2 class");
   }
   
   @BeforeMethod
   public void Abefore()
   {
	   System.out.println("ABefore Method of Test2 class");
   }
}
