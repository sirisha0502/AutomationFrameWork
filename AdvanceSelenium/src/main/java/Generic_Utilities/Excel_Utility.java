package Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility 
{
   public String readExcelData(String sheetName,int RowNum,int CellNum) throws Throwable
   {
   
   FileInputStream fis1 = new FileInputStream("./src/test/resources/TestData11.xlsx");
	
	Workbook book = WorkbookFactory.create(fis1);
					
	Sheet sheet = book.getSheet(sheetName);
					
	Row row = sheet.getRow(RowNum);
					
	Cell cell = row.getCell(CellNum);
	
	String excelData = cell.getStringCellValue();
	System.out.println(excelData);
	return excelData;
   }
   
   public String readExcelDataUsingDataFormatter(String sheetName,int rowNum,int cellNum) throws Throwable
   {
	   FileInputStream fis1 = new FileInputStream("./src/test/resources/TestData11.xlsx");
		
		Workbook book = WorkbookFactory.create(fis1);
						
		Sheet sheet = book.getSheet(sheetName);
						
		Row row1 = sheet.getRow(rowNum);
						
		Cell cell1 = row1.getCell(cellNum);
		
		DataFormatter format1 = new DataFormatter();
		String excelData = format1.formatCellValue(cell1);
		System.out.println(excelData);
	    return excelData;
	   
   }
   public Object[][] readExcelDataForDataProvider(String sheetName) throws Throwable
   {
	   FileInputStream fis1 = new FileInputStream("./src/test/resources/TestData11.xlsx");
		
		Workbook book = WorkbookFactory.create(fis1);
						
		Sheet sheet = book.getSheet(sheetName);
		
		int lastRow = sheet.getLastRowNum()+1;
		short lastCell = sheet.getRow(0).getLastCellNum();
		
		Object[][] obj = new Object[lastRow][lastCell];
		
		for (int i = 0; i < lastRow; i++) 
		{
			for (int j = 0; j < lastCell; j++) 
			{
				obj[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return obj;
   }
   }
