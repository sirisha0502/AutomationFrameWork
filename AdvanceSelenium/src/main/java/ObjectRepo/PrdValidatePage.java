package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PrdValidatePage
{
	public  PrdValidatePage (WebDriver driver)
	  {
		PageFactory.initElements(driver, this);
	  }
	  /**
	   * @param driver
	   * @param PrdName
	   * @return
	   */
	  public String validateProduct(WebDriver driver, String PrdName)
	  {
		  String actData1 = driver.findElement(By.id("dtlview_Product Name")).getText();
	       
//	       if(actData1.contains(PrdName))
//			{
//				System.out.println("Product Name is created");
//			}
//			else 
//			{
//				System.out.println("Product name is not created");
//			}
			return actData1;
	  }
}
