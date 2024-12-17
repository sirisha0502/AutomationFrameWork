package Product;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import ObjectRepo.CreatePrdPage;
import ObjectRepo.LoginVtigerPage;
import ObjectRepo.PrdDetailedPage;
import ObjectRepo.PrdValidatePage;
import ObjectRepo.VtigerHomePage;

@Listeners(Generic_Utilities.Listener.class)
public class CreateProductTest extends BaseClass
{
	@Test(groups  ="sanity")
	public void createProductTest() throws Throwable
	{
		WebDriver_Utility wlib = new WebDriver_Utility();
		File_Utility flib = new File_Utility();
		Java_Utility jlib = new Java_Utility();
		Excel_Utility elib = new Excel_Utility();
	
		VtigerHomePage home = new VtigerHomePage(driver);
		home.clickPrdLink();
		
		PrdDetailedPage img = new PrdDetailedPage(driver);
		img.clickOnPlusSign();
				
		int ranNum = jlib.getRandomNum();
		
		
	    String PrdName = elib.readExcelData("Product",0,0) + ranNum;
	    System.out.println(PrdName);
		

	    CreatePrdPage createPage = new CreatePrdPage(driver);
	    createPage.enterPrdName(PrdName);
	    createPage.clickSaveButton();
       
       Thread.sleep(2000);

       PrdValidatePage validate = new PrdValidatePage(driver);
       String actData = validate.validateProduct(driver, PrdName);
       Assert.assertEquals(actData, PrdName);
       System.out.println("Product name is created");
  
	}

}
