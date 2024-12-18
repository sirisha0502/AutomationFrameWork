package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultipleAttributes 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();

		// Using And operator
	//Syntax:- //htmltag[@AtrributeName='AttributeValue' and @AtrributeName='AttributeValue']
		
		//driver.findElement(By.xpath("//input[@type='text' and @name='field-keywords']")).sendKeys("Puma");
		
		// Using Or operator
	//Syntax:- //htmltag[@AtrributeName='AttributeValue' or @AtrributeName='AttributeValue']
		
		//driver.findElement(By.xpath("//input[@value='Go' or @type='sub']")).click();
		
		//Using text() in the path
	//Syntax3:-  //htmltag[@AtrributeName='AttributeValue' and text()='AttributeValue']
		
		//driver.findElement(By.xpath("//a[@class='nav-a  ' and  text()='Sell']")).click();
		
		//Using text() in the path
	//Syntax4:-  //htmltag[text()='AttributeValue' or @AtrributeName='AttributeValue']
		
		//driver.findElement(By.xpath("//a[text()='Mobiles' or @data-csa-c-slot-id='nav_cs_5']")).click();
		
		//Using contains
	//syntax5:-//htmltag[contains(@AtrributeName='AttributeValue' and/or text()='AttributeValue')]
		
	//	driver.findElement(By.xpath("//a[contains(@data-csa-c-content-id,'nav_cs_elect') or contains(text(),' Elect')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'twotab') and @name='field-keywords']")).sendKeys("Nike");
		}

}
