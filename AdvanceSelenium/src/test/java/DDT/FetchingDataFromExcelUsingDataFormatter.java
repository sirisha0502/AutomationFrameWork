package DDT;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcelUsingDataFormatter {

	public static void main(String[] args) throws Throwable 
	{
		 // step1 :- Path setting of the excel file
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData11.xlsx");
		
		//step2:- keep the file in read mode
		Workbook book = WorkbookFactory.create(fis);
		
		//step 3:- Navigating to sheet
		Sheet sheet = book.getSheet("Sheet1");
		
		//step 4:- Navigating to the row
		Row row = sheet.getRow(0);
		
		//step5 :- Navigating to the cell
		Cell cell = row.getCell(0);
		
		DataFormatter format = new DataFormatter();
		String ExcelData = format.formatCellValue(cell);
		System.out.println(ExcelData);
	}

}
