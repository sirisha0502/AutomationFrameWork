package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Amazon 
{

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("[data-csa-c-slot-id='nav_cs_4']")).click();
		driver.findElement(By.cssSelector("[data-csa-c-element-id='filter-bubble-deals-collection-mobiles']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[data-testid='product-card-link']")).click();
		
	//	syntax 2
		
	//	driver.findElement(By.cssSelector("a[href=\"/minitv?ref_=nav_avod_desktop_topnav\"]")).click();
	//	driver.findElement(By.cssSelector("[data-testid='appnavbar-menuitem-ct-web-series']")).click();

	}	
}
