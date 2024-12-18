package Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingApproach2Ex1 {

	public static void main(String[] args) 
	{
		 WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demo.automationtesting.in/Windows.html");
		  
		  driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		  driver.findElement(By.xpath("//button[text()='click']")).click();
		  
		  //String Win1 = driver.getWindowHandle();
		  //System.out.println(Win1);
		  
		  Set<String> Win2 = driver.getWindowHandles();
		  //System.out.println(Win2);
		  
		  for (String id : Win2) 
		  {
			  driver.switchTo().window(id);
			  String title = driver.getTitle();
			  System.out.println(title);
			  
			  if (title.contains("Selenium"))
			  {
				break;
			}
		  }
		  driver.findElement(By.xpath("//a[text()='Register now!']")).click();
	}

}
