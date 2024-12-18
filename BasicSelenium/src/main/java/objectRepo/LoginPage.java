package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//Initialization
	public LoginPage (WebDriver driver) 
	{
	 PageFactory.initElements(driver, this);	
	}
		
 // Declaration
	@FindBy(id ="user-name")
	private WebElement userTextField;
	
	@FindBy(xpath = "//input[@type=\"password\"]")
	private WebElement passwordTextField;
	
//	@FindBys({@FindBy(css = "[type=\"submit\"]"),@FindBy(id = "login-button")})
//	private WebElement loginButton;
	
	@FindAll({@FindBy(css = "[type=\"submit\"]"),@FindBy(id = "login-button")})
	private WebElement loginButton;

	//getter methods
	public WebElement getUserTextField() {
		return userTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//Business logics
	public void loginToApplication(String userName ,String passWord)
	{
	   userTextField.sendKeys(userName);
	   passwordTextField.sendKeys(passWord);
	   loginButton.click();
	}
	
	
	
}
