package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5TraversingFk 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
	    driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone15");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	 
		//Approach1
		// String phnprice=  driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
	   //System.out.println(phnprice);
		
		// Approach2
		
		//String phoneprice = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Pink, 256 GB)']/../..//div[@class='Nx9bqj _4b5DiR']")).getText();
		//System.out.println(phoneprice);
		
		//Approach3
		String phnnPrice = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']/../following-sibling::div[@class='col col-5-12 BfVC2z']//div[@class='Nx9bqj _4b5DiR']")).getText();
		System.out.println(phnnPrice);
		
		
		
	}

}
