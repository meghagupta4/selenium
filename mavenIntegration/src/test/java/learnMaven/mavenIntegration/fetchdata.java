package learnMaven.mavenIntegration;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class fetchdata {

	@Test
	public void getdata() throws IOException {
		
		ArrayList<String> alist = new ArrayList();
 		FileInputStream fis = new FileInputStream("C:\\Users\\212704032\\eclipse-workspace\\mavenIntegration\\data2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int sheets = wb.getNumberOfSheets();
		XSSFSheet sh = wb.getSheetAt(0);
		
		Iterator<Row> rows = sh.iterator();
		Row first = rows.next();
		Iterator<Cell> ce = ((Row) rows).cellIterator();
		
		int k=0 , column=0;
		while(ce.hasNext())
		{
			Cell value = ce.next();
			if(value.getStringCellValue().equalsIgnoreCase("testcases"))
			{
				column=k;
			}
			k ++;
		}
		
		System.out.println("Column"+k);
		
		while(rows.hasNext())
		{
			Row r = rows.next();
			if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Search"))
			{
				Iterator <Cell> cv= r.cellIterator();
				while(cv.hasNext())
				{
					System.out.println(cv.next().getStringCellValue());
					alist.add(cv.next().getStringCellValue());
					
				}
				
			}
		
		}

	}
}
