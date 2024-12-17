package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampPage
{
  public CreateCampPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  @FindBy(name = "campaignname")
  private WebElement campName;
  
  @FindBy(css = "[title=\"Save [Alt+S]\"]")
  private WebElement saveButton;
  
  @FindBy(xpath = "//img[@alt=\"Select\"]")
	private WebElement PrdPlusSign;

  
  //getter method
  public WebElement getSaveButton()
  {
	return saveButton;
}
  public WebElement getCampName() 
  {
  	return campName;
  }
/**
 * 
 * @param name
 */
public void enterCampName(String name)
  {
	  campName.sendKeys(name);
	  
  }
public void clickPrdPlusSign()
{
	PrdPlusSign.click();
}


public void clickSaveButton()
{
	saveButton.click();
}

}
