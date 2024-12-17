package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_Utilities.WebDriver_Utility;

public class FlipkartIphone {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		WebDriver_Utility wlib = new WebDriver_Utility();
		wlib.maximizeWindow(driver);
		
		driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]")).sendKeys("iphone15");
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
		
	}

}
