package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAmazon {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		//syntax1-->xpath
		//driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Nike");
		
		//syntax3:-->xpath by contains Attribute()
		// htmltag[contains(@Attributename,'AttributeValue')]
  
		//driver.findElement(By.xpath("//input[contains(@placeholder,'S')]")).sendKeys("Bluetooth");
		
		//syntax4:-->xpath by contains text()
				// htmltag[contains(text(),'AttributeValue')]
		driver.findElement(By.xpath("//a[contains(text(),\"als\")]")).click();  //todays deals
		
	}

}
