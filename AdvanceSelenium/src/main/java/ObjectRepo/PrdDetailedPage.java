package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrdDetailedPage
{
	public PrdDetailedPage(WebDriver driver) 
	  {
		PageFactory.initElements(driver, this);
	  }
	
	@FindBy(css = "[title=\"Create Product...\"]")
	private WebElement prdPlusSign;

	//getter method
	public WebElement getLookUpImg()
	{
		return prdPlusSign;
	}
	//Business logic
	/**
	 * Image plus sign
	 */
	public void clickOnPlusSign() 
	{
		prdPlusSign.click();
	}
	
}
