import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class fetchdata {

	//public static void main(String[] args) throws IOException {
	
	@Test
	public void getdata() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\212704032\\eclipse-workspace\\Exceldriven\\data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int sheets = wb.getNumberOfSheets();
		XSSFSheet sh = wb.getSheetAt(0);
		
		Iterator<Row> rows = sh.iterator();
		Row first = rows.next();
		Iterator<Cell> ce = ((Row) rows).cellIterator();
		
		int k=0 , column;
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
		
		
	}

}
