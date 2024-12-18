package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEx {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.in/");
		
		//locator 4 :- linkText()
		
		//driver.findElement(By.linkText("Grocery")).click();
		
		//locator 5 :- PartialLinkText()
		
		//driver.findElement(By.partialLinkText("Gro")).click();
		
		
	}

}
