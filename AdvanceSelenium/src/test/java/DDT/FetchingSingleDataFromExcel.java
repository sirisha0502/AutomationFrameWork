package DDT;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingSingleDataFromExcel {

	public static void main(String[] args) throws Throwable 
	{
		
      // step1 :- Path setting of the excel file
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData11.xlsx");
		
		//step2:- keep the file in readmode
		Workbook book = WorkbookFactory.create(fis);
		
		//step 3:- Navigating to sheet
		Sheet sheet = book.getSheet("Sheet1");
		
		//step 4:- Navigating to the row
		Row row = sheet.getRow(1);
		
		//step5 :- Navigating to the cell
		Cell cell = row.getCell(0);
		
		String ExcelData = cell.getStringCellValue();
		System.out.println(ExcelData);
	}

}
