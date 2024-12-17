package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage
{
   public CreateOrganizationPage (WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath = "//input[@name=\"accountname\"]")
   private WebElement accName;
   
   @FindBy(xpath = "//input[@name=\"phone\"]")
   private WebElement phnNum;
   
   @FindBy(xpath = "//input[@name=\"email1\"]")
   private WebElement emailId;
   
   @FindBy(xpath = "//input[@title=\'Save [Alt+S]']")
   private WebElement saveButton;

   //getter methods
public WebElement getAccName() 
{
	return accName;
}

public WebElement getPhnNum()
{
	return phnNum;
}

public WebElement getEmailId() 
{
	return emailId;
}
   
   //Business logic
  public void enterOrgName(String name) 
  {
	accName.sendKeys(name);
  }
  public void enterPhnNum(String Num)
  {
	  phnNum.sendKeys(Num);
  }
  public void enterEmailId(String mailId)
  {
	  emailId.sendKeys(mailId);
  }
  public void enterOrgData(String name, String phoneNum, String emailId1)
  {
	  accName.sendKeys(name);
	phnNum.sendKeys(phoneNum);
	emailId.sendKeys(emailId1);
  }
  public void clickSaveButton() 
  {
	saveButton.click();
  }
  
}
