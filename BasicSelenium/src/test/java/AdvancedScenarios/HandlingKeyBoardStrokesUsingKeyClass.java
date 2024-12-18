package AdvancedScenarios;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardStrokesUsingKeyClass {

	public static void main(String[] args) 
	{
		//Two Approaches
		//*keys class---->Static Method
		//*Robot class---->Non Static Methods
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.saucedemo.com/v1/");
		
		//case 1:
	//	WebElement UserName = driver.findElement(By.name("user-name"));
	//  UserName.sendKeys("standard_user",Keys.TAB);
		
	//	driver.findElement(By.name("password")).sendKeys("secret_sauce",Keys.ENTER);
		
		//case 2:
	//	driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		
	// case 3: using keys for select the username,copy it and paste it in password field
		WebElement UserName = driver.findElement(By.name("user-name"));
	    UserName.sendKeys("standard_user",Keys.CONTROL+"a");
	    UserName.sendKeys(Keys.CONTROL+"c");
	    UserName.sendKeys(Keys.TAB , Keys.CONTROL+"v");
	}

}
