package frameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataToExcelSheet {

	public static void main(String[] args) throws Throwable 
	{
		//Step 1:- Path connection
		FileInputStream fis = new FileInputStream("./src/test/resources/ExcelData.xlsx");
		
		//Step 2:- ExcelFile in read mode
		Workbook book = WorkbookFactory.create(fis);
		
		//Step 3:- getting control on the sheet
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row = sheet.createRow(10);
		 
	    Cell cel = row.createCell(10);
	
		cel.setCellValue("Ruthvika");
		
		//Step 4:- excel file in write mode
		FileOutputStream fos = new FileOutputStream("./src/test/resources/ExcelData.xlsx");
		book.write(fos);
		book.close();


	}

}
