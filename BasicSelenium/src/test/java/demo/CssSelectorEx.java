package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorEx {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
		//locator 6: css Selector()  
		//syntax1:- [ArrtibuteName='AttributeValue']
		
	//	driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
	//  driver.findElement(By.cssSelector("[type='password']")).sendKeys("secret_sauce");
	//	driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
		//syntax2:-htmaltag[ArrtibuteName='AttributeValue']
		
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("standard_user");
	//	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
		
		//Syntax3:- Applicable to only id Attribute ----->#
		//          #AttributeValue
		
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		//driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");

		//Syntax4:- Applicable to only id Attribute ----->#
				//       htmltag #AttributeValue
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
	    driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		
		//Syntax5:- Applicable to only classname Attribute ----->.
		//             .AttributeValue
		
		//driver.findElement(By.cssSelector(".btn_action")).click();
		
		//Syntax6:- Applicable to only classname Attribute ----->.
				//       htmltag .AttributeValue
		
		driver.findElement(By.cssSelector("input.btn_action")).click();
	}

}
