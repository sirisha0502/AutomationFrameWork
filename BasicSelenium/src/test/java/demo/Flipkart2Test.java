package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart2Test 
{
   @Test
   public void flipkart2()
   {
	   WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.in/");
		
		driver.findElement(By.cssSelector("input[title='Search for Products, Brands and More']")).sendKeys("Reebok");
		driver.findElement(By.cssSelector("[class='_2iLD__']")).click();
      // driver.findElement(By.cssSelector("[class='hEjLuS WyLc0s']")).click();
		String name = driver.findElement(By.cssSelector("[title=\"Men's Sports Shoes\"]")).getText();
		System.out.println(name);
   }
}
