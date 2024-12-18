package AdvancedScenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingJavaScriptExecutor {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	/*	JavascriptExecutor js = (JavascriptExecutor)driver;
		for (int i = 0; i < 5; i++) 
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
		}
		for (int i = 0; i < 3; i++) 
		{
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(2000);
			
		}*/
		
		driver.get("https://demo.automationtesting.in/Windows.html ");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		for(int i=0; i<2;i++)
		{
			js.executeScript("window.scrollBy(100,0)");
			Thread.sleep(2000);
		}
		
		for(int i=0; i<2;i++)
		{
			js.executeScript("window.scrollBy(-100,0)");
			Thread.sleep(2000);
		}
		
		
		
		
	}

}
