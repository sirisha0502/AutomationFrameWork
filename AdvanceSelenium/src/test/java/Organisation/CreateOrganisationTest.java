package Organisation;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
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
import ObjectRepo.CreateOrganizationPage;
import ObjectRepo.LoginVtigerPage;
import ObjectRepo.OrganizationDetailedPage;
import ObjectRepo.OrgValidatePage;
import ObjectRepo.VtigerHomePage;

public class CreateOrganisationTest extends BaseClass
{

	//hi i am Branch2---->Ruthvi

	// i am Branch1---->Siri

@Test(groups = "Regression")
	public void createOrganisationTest() throws Throwable
	{
		File_Utility flib = new File_Utility();
	
   		VtigerHomePage home = new VtigerHomePage(driver);
		home.clickOrgLink();
		
		OrganizationDetailedPage plusImg = new OrganizationDetailedPage(driver);
		plusImg.clickOrgLookUpImg();
//--------------------------------------------------------------------------------------------------------
		Java_Utility jlib = new Java_Utility();
		int ranNum = jlib.getRandomNum();
//----------------------------------------------------------------------------------------------------
		
	    Excel_Utility elib = new Excel_Utility();
	    String OrgName = elib.readExcelData("Organisation",0,0) + ranNum;
	    System.out.println(OrgName);
//----------------------------------------------------------------------------------------------------

	    String phnNum = elib.readExcelDataUsingDataFormatter("Organisation",1,0);
	   
//------------------------------------------------------------------------------------------------------	

		String emailId = elib.readExcelDataUsingDataFormatter("Organisation",2,0);
		
//-----------------------------------------------------------------------------------------------------
		CreateOrganizationPage createPage = new CreateOrganizationPage(driver);
//		createPage.enterOrgName(OrgName);
//		createPage.enterPhnNum(phnNum);
//		createPage.enterEmailId(emailId);
		
		createPage.enterOrgData(OrgName, phnNum, emailId);
    	createPage.clickSaveButton();
//-----------------------------------------------------------------------------------------------------		
		Thread.sleep(2000);

		OrgValidatePage validate = new OrgValidatePage(driver);
		String actData = validate.validateOrganization(driver, OrgName);
		Assert.assertEquals(actData,OrgName );
		System.out.println("Organisation name is created");
		
	}
}
