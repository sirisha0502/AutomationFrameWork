package Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingEx1 {

	public static void main(String[] args) 
	{
		
	  //Two Approaches
		//*Using Windows Ids ----> Can Handle 2 windows
		//*Using Windows Title ------> Can Handle multiple Windows
		
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.flipkart.com");
	  
	  driver.findElement(By.name("q")).sendKeys("Iphone",Keys.ENTER);
	  driver.findElement(By.xpath("//img[@alt='Apple iPhone 15 (Black, 128 GB)']")).click();
	  
	 String MainId=driver.getWindowHandle();   //window1
	 System.out.println(MainId);
	 
	 Set<String> AllIds = driver.getWindowHandles();  //In set insertion order is not preserved ,in List it is preserved
	 //window1,window2
	 System.out.println(AllIds);
	 for (String id : AllIds) 
	 {
	    if (!MainId.equals(id)) //win1 != win1
	    {
			driver.switchTo().window(id);
			 String Phnname = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (Black, 128 GB)']")).getText();
			 System.out.println(Phnname);
		}	
	}
	}

}
