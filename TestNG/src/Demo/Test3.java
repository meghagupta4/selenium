package Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test3 {

	@BeforeClass
	public void testC()
	{
		System.out.println(" Test3 - testC");
	}
	
	@AfterClass
	public void testD()
	{
		System.out.println(" Test3 - testD");
	}
	
	@Test(groups= {"Sanity"})
	public void testA()
	{
		System.out.println("Test3 - testA| Group Sanity");
	}
	@Test(groups= {"Sanity"} , enabled =false)
	public void testB()
	{
		System.out.println("Test3 - testB |Group Sanity");
	}
	
	
	
}
