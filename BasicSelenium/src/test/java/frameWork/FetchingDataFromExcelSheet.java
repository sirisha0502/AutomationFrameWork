package frameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcelSheet {

	public static void main(String[] args) throws Throwable
	{
		//Apache poi dependencies need to be added
		
		//Step 1:- Path connection
		FileInputStream fis = new FileInputStream("C:\\Users\\Sagar\\Desktop\\Selenium\\ExcelData.xlsx");
		
		//Step 2:- ExcelFile in read mode
		Workbook book = WorkbookFactory.create(fis); //create-->is used to read the data from excel sheet
		
		//Step 3:- getting control on the sheet
	    Sheet sheet = book.getSheet("sheet1");
	    
	    //Step 4:- getting control on row number
	    Row row = sheet.getRow(10);
	    
	    //Step 5 :- getting control on cell number
	    Cell cel = row.getCell(3);
	    
	    String exceldata = cel.getStringCellValue();
	    System.out.println(exceldata);

	}

}
