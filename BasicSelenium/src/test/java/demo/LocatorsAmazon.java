package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsAmazon {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma");
		
	//	driver.findElement(By.name("field-keywords")).sendKeys("PUMA");
		
	//	driver.findElement(By.id("nav-search-submit-button")).click();
		
		//locator 4 :- linktext()
		
	//	driver.findElement(By.linkText("Today's Deals")).click();

		//locator 5 :- Partial linkText()
		
	//	driver.findElement(By.partialLinkText(" miniTV")).click();
		
		//locator 6 :- Css Selector()  Syntax 1
		
		//driver.findElement(By.cssSelector("[placeholder ='Search Amazon.in']")).sendKeys("PUMA");
		
		//Css locatorSyntax3:- Applicable to only id Attribute ----->#
				//          #AttributeValue
		
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Reebok");
	//	driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		
		//Xpath
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div/input")).sendKeys("Puma");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();
		}

}
