package Campaign;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_Utility;
import ObjectRepo.CampDetailedPage;
import ObjectRepo.CampValidatePage;
import ObjectRepo.CreateCampPage;
import ObjectRepo.VtigerHomePage;

//@Listeners(Generic_Utilities.Listener.class)

 @Listeners(Generic_Utilities.ExtentReport.class)
public class CreateCampaignTest extends BaseClass
{
//	@Test(retryAnalyzer = Generic_Utilities.RetryImp.class)
	@Test
	public void createCampaignTest()throws Throwable 
	{
		WebDriver_Utility wlib = new WebDriver_Utility();
		File_Utility flib = new File_Utility();
		Java_Utility jlib = new Java_Utility();
		Excel_Utility elib= new Excel_Utility();
				
		VtigerHomePage home = new VtigerHomePage(driver);
		home.clickMoreLink();
		home.clickCampLink();
			
		CampDetailedPage img = new CampDetailedPage(driver);
		img.clickCampLookUpImg();
		
	//	Assert.fail();
//		System.out.println("Failing Script");
		
		int ranNum = jlib.getRandomNum();
				
		String CampName = elib.readExcelData("Campaign", 0,0)+ranNum;
		System.out.println(CampName);
		
		CreateCampPage createPage = new CreateCampPage(driver);
		createPage.enterCampName(CampName);
		createPage.clickSaveButton();
					
		CampValidatePage validate = new CampValidatePage(driver);
		String actData = validate.validateCampaign(driver, CampName);
		Assert.assertEquals(actData, CampName);
		System.out.println("Campagin Name is created");
	}
//---------------------------------------------------------------------------------------------------
//	@Test
//	public void createProductTest() throws Throwable
//	{
//		WebDriver_Utility wlib = new WebDriver_Utility();
//		File_Utility flib = new File_Utility();
//		Java_Utility jlib = new Java_Utility();
//		Excel_Utility elib = new Excel_Utility();
//	
//		VtigerHomePage home = new VtigerHomePage(driver);
//		home.clickPrdLink();
//
//		PrdDetailedPage img = new PrdDetailedPage(driver);
//		img.clickOnPlusSign();
//				
//		int ranNum = jlib.getRandomNum();
//		
//		
//	    String PrdName = elib.readExcelData("Product",0,0) + ranNum;
//	    System.out.println(PrdName);
//		
//
//	    CreatePrdPage createPage = new CreatePrdPage(driver);
//	    createPage.enterPrdName(PrdName);
//	    createPage.clickSaveButton();
//       
//       Thread.sleep(2000);
//
//       PrdValidatePage validate = new PrdValidatePage(driver);
//       validate.validateProduct(driver, PrdName);
//  
//	}
//	@Test
//	public void m1()
//	{
//		System.out.println("hi");
//	}

}
