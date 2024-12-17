package Campaign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

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
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import ObjectRepo.CampDetailedPage;
import ObjectRepo.CampValidatePage;
import ObjectRepo.CreateCampPage;
import ObjectRepo.CreatePrdPage;
import ObjectRepo.LoginVtigerPage;
import ObjectRepo.PrdDetailedPage;
import ObjectRepo.PrdValidatePage;
import ObjectRepo.SwitchingProductPage;
import ObjectRepo.ValidateCampaignsWithProduct;
import ObjectRepo.VtigerHomePage;

public class CreateCampaignWithProductTest extends BaseClass 
{
@Test(groups = "smoke")
	public void createCampaignWithProductTest() throws Throwable
	{
	    File_Utility flib = new File_Utility();
		Java_Utility jlib = new Java_Utility();
		WebDriver_Utility wlib = new WebDriver_Utility();
		Excel_Utility elib = new Excel_Utility();
		
		VtigerHomePage home = new VtigerHomePage(driver);
		home.clickPrdLink();
				
		PrdDetailedPage prdPlus = new PrdDetailedPage(driver);
		prdPlus.clickOnPlusSign();
		
		int ranNum = jlib.getRandomNum();
		
		String PrdName = elib.readExcelData("Product", 0, 0)+ranNum;
		System.out.println(PrdName);
		
		CreatePrdPage prdPage = new CreatePrdPage(driver);
		prdPage.enterPrdName(PrdName);
		prdPage.clickSaveButton();
//---------------------------------------------------------------------------------------------------------------------------------
		//navigate to campaign Module
		home.clickMoreLink();
		home.clickCampLink();
		CampDetailedPage campImg = new CampDetailedPage(driver);
		campImg.clickCampLookUpImg();
			
       String CampName = elib.readExcelData("Campaign", 0, 0)+ranNum;
       System.out.println(CampName);
		
	//click on + sign to navigate Product table
       
		CreateCampPage campPage = new CreateCampPage(driver);
		campPage.enterCampName(CampName);
	    campPage.clickPrdPlusSign();
	
		wlib.windowSwitching(driver, "Products&action");
		
		SwitchingProductPage switchWin = new SwitchingProductPage(driver);
		switchWin.enterPrdName(PrdName);
		switchWin.searchPrdName();
				
		Thread.sleep(2000);
		
		//Dynamic xpath
		switchWin.selectExpPrdName(driver, PrdName);

		wlib.windowSwitching(driver, "Campaigns&action");
		
		campPage.clickSaveButton();

         ValidateCampaignsWithProduct validate = new ValidateCampaignsWithProduct(driver);
		String actData = validate.validateCampName(driver, CampName);
		Assert.assertEquals(actData, CampName);
		System.out.println("Campagin Name is created");
    	 String actData1 = validate.validatePrdName(driver, PrdName);
    	 Assert.assertEquals(actData1, PrdName);
 		System.out.println("Product Name is created");
		 
	}
}
