package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertSingleDataIntoExcel {

	public static void main(String[] args) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData11.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
	    Row row = sheet.createRow(5);
	    Cell cell = row.createCell(5);
	    cell.setCellValue("Moukthika");
	    
	    //keep the excel file in the write mode
	    FileOutputStream fos = new FileOutputStream("./src/test/resources/TestData11.xlsx");
	    book.write(fos);
	    book.close();

	}

}
