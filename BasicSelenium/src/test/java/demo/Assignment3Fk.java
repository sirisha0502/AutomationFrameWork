package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3Fk {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.in/");
		
		driver.findElement(By.cssSelector("input[title='Search for Products, Brands and More']")).sendKeys("Reebok");
		driver.findElement(By.cssSelector("[class='_2iLD__']")).click();
		
		String name=driver.findElement(By.cssSelector("[title=\"Men's Sports Shoes\"]")).getText();
		System.out.println(name);
		
       String name1= driver.findElement(By.cssSelector("[title=\"Women's Sports Shoes\"]")).getText();
       System.out.println(name1);
       
       String name2= driver.findElement(By.cssSelector("[title=\"Men's Slippers & Flip Flops\"]")).getText();
       System.out.println(name2);
       
       String name3= driver.findElement(By.cssSelector("[title=\"Men's Casual Shoes\"]")).getText();
       System.out.println(name3);
       
       String name4= driver.findElement(By.cssSelector("[title=\"Men's Sandals & Floaters\"]")).getText();
       System.out.println(name4);
       
       driver.findElement(By.cssSelector("[class='_2rvJ8t uWfXeF']")).click();
       
       String name5= driver.findElement(By.cssSelector("[title=\"Women's Casual Shoes\"]")).getText();
       System.out.println(name5);
       
       String name6= driver.findElement(By.cssSelector("[title=\"Women's Slippers & Flip Flops\"]")).getText();
       System.out.println(name6);
       
       String name7= driver.findElement(By.cssSelector("[title=\"Boys' Sports Shoes\"]")).getText();
       System.out.println(name7);
       
       String name8= driver.findElement(By.cssSelector("[title=\"Girls' Sports Shoes\"]")).getText();
       System.out.println(name8);  
	}
}
