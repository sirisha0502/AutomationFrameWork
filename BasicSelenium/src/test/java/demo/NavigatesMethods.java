package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatesMethods {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//method 8
		
		//alternative approach or method to launch the webApplication
		//driver.navigate().to("https://www.makemytrip.com");
		
		Thread.sleep(2000);
		driver.get("https://www.ajio.com");
	
		Thread.sleep(2000);
	   driver.navigate().back();
	
	   Thread.sleep(2000);
	   driver.navigate().forward();
	
	   Thread.sleep(2000);
	   driver.navigate().refresh();
	   
	   driver.close();
	}

}
