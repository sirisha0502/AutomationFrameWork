package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePrdPage 
{
	public CreatePrdPage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	
	  @FindBy(name = "productname")
	  private WebElement prdName;

	  @FindBy(css = "[title=\"Save [Alt+S]\"]")
	  private WebElement saveButton;
	  
	  //getter methods
	  public WebElement getPrdName()
	  {
			return prdName;
	  }

	  public WebElement getSaveButton() 
	  {
			return saveButton;
	  }
	  
	  //Business Logic
	  public void enterPrdName(String name)
	  {
		  prdName.sendKeys(name);
	  }

	public void clickSaveButton()
	{
		saveButton.click();
	}
}
