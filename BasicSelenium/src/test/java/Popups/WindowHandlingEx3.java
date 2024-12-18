package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingEx3 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		 Set<String> allWins = driver.getWindowHandles();//win1,win2

		   for (String win : allWins)
		   {
			driver.switchTo().window(win);
			String title = driver.getTitle();
		    System.out.println(title);
		    if(title.contains("Selenium"))
		    {
		    	break;
		    }
		   }
		   driver.findElement(By.xpath("//a[text()='Register now!']")).click();
		 //------------------------------------------------------------------------------------------------
		   Set<String> allWins1 = driver.getWindowHandles();//win1,win2,win3

		   for (String win1 : allWins1)
		   {
			driver.switchTo().window(win1);
			String title1 = driver.getTitle();
		    System.out.println(title1);
		    if(title1.contains("Appium Conf 2024"))
		    {
		    	break;
		    }
		   }
		   
		   driver.findElement(By.xpath("//a[text()='View Details']")).click();
		  driver.close();
		 //  driver.quit();
		 //------------------------------------------------------------------------------------------------ 
		   Set<String> allWins2 = driver.getWindowHandles();//win1,win2,win3

		   for (String win2 : allWins2)
		   {
			driver.switchTo().window(win2);
			String title1 = driver.getTitle();
		    System.out.println(title1);
		    if(title1.contains("Frames & windows"))
		    {
		    	break;
		    }
		   }
		   
		   driver.close();
		   

	}

}
