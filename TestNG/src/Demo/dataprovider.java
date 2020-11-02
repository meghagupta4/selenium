package Demo;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;


public class dataprovider {

	
	@Test(dataProvider = "fetchdata")
	public void login(String usr , String pwd)
	{
		System.out.println(usr);
		System.out.println(pwd);
	}
	
	@DataProvider
	public  Object[][] fetchdata()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="meghalogin";
		data[0][1]="pwd1";
		data[1][0]="nidhilogin";
		data[1][1]="pwd2";
		data[2][0]="udemylogin";
		data[2][1]="pwd3";
		return data;
	}
	
}
