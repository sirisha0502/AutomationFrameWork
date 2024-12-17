package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampDetailedPage 
{
  public CampDetailedPage(WebDriver driver) 
  {
	PageFactory.initElements(driver, this);
  }
  
  @FindBy(css = "[alt=\"Create Campaign...\"]")
  private WebElement  lookUpImg;

public WebElement getCreateCamp()
{
	return lookUpImg;
}
/**
 * Image plus sign
 */
public void clickCampLookUpImg() 
{
	lookUpImg.click();
}
}
