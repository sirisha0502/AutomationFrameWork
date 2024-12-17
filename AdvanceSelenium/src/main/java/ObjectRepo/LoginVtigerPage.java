package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginVtigerPage
{
	//Initialization-->constructor name should be same as Class Name
	public LoginVtigerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);   //intiElements is compulsory to call all the annotation methods into different class
	}
	
	
   //Elements Declaration 
	@FindBy(name="user_name")
	private WebElement UserTextField;    //for securing elements we are making it as Private
	
	@FindAll({@FindBy(css = "[type=\"password\"]"),@FindBy(name="user_password")})
	private WebElement PassWordTextField;
	
	@FindAll({@FindBy(xpath = "//input[@type=\"submit\"]"), @FindBy(id="submitButton")})
	private WebElement LoginButton;

	//getter methods     //right click on the page->select source->generate getter and setters->select getter->generate
	public WebElement getUserTextField() 
	{
		return UserTextField;
	}

	public WebElement getPassWordTextField() 
	{
		return PassWordTextField;
	}

	public WebElement getLoginButton()
	{
		return LoginButton;
	}
	
	//Business logics
	/**
	 * This Method is used to login into Vtiger application
	 */
	public void loginIntoVtiger(String username,String password)
	{
		UserTextField.sendKeys(username);
		PassWordTextField.sendKeys(password);
		LoginButton.click();
	}
}
