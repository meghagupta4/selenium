package Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

	@Test(groups= {"Sanity"})
	public void Ztest1()
	{
		System.out.println("Test1:test1 - Group Sanity");
	}
	
	@Parameters({"qaurl"})
	@Test
	public void Atest2( String qa)
	{
		System.out.println("Test1:test2");
		System.out.println("param - qa url ");
	}
}
