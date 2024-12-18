package demo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4Xpath 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//input[contains(@title,'Search for Products, Brands and More')]")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
		int count=0;
	    List<WebElement> names = driver.findElements(By.xpath("//div[@class='KzDlHZ']")); 
	    //list of 24 names will be stored in list of webelements
	    List<WebElement> price =driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
	  //list of 24 prices will be stored in list of webelements
	    
     //   for (WebElement phnname : names)
   //     {
	//		System.out.println(phnname.getText());
	//		count++;
	//	}
	//	System.out.println("total num of phone names:" +count);	
		
		for (int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i).getText()+"-------------------"+price.get(i).getText());
		}
     }
}
