package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class globalValues {
	
 public static void main(String[] args) throws IOException
 {
	 
	 Properties prop = new Properties();
	 FileInputStream fis = new FileInputStream("C:\\Users\\212704032\\eclipse-workspace\\TestNG\\globaldata.properties");
	 prop.load(fis);
	 System.out.println(prop.getProperty("browser"));
	 System.out.println(prop.getProperty("url"));
	 prop.setProperty("browser","firefox");
	 FileOutputStream fout = new FileOutputStream("C:\\\\Users\\\\212704032\\\\eclipse-workspace\\\\TestNG\\\\globaldata.properties");
	 prop.store(fout,null);
	 
	 
 }

}
