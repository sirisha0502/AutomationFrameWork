package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ValidateCampaignsWithProduct
{
	public ValidateCampaignsWithProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateCampName(WebDriver driver,String CampName)
	{
		String actData = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();

//		if (actData.contains(CampName)) 
//		{
//			System.out.println("Campaigns Name is Created");
//		} else
//		{
//			System.out.println("Campaigns name not created");
//		}
		return actData;
	}
	public String validatePrdName(WebDriver driver,String PrdName)
	{
	    String actData1 = driver.findElement(By.xpath("//span[@id=\"dtlview_Product\"]")).getText();
//	    if (actData1.equals(PrdName)) 
//	   {
//		  System.out.println("Product Name is Created");
//	   } 
//	    else 
//	   {
//		System.out.println("Product name is not created");
//	   }
		return actData1;
    }
}
