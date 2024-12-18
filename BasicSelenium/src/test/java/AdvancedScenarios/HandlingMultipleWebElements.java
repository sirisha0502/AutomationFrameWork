package AdvancedScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWebElements {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		//how to print total no of links
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int count = 0;
		for (WebElement link : allLinks) 
		{
		//  System.out.println(link.getText());	//fetches all the visible text
		 System.out.println(link.getAttribute("href")); //prints all the links of web element
		  count++;
		}
		System.out.println("total num of count :"+count);
	}
}
