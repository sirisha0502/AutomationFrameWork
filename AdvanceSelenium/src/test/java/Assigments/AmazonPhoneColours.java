package Assigments;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_Utilities.WebDriver_Utility;

public class AmazonPhoneColours {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone15");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
//		Robot rob = new Robot();
//		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
//		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		
//		Thread.sleep(5000);
//		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
//		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		WebDriver_Utility wlib = new WebDriver_Utility();
		wlib.handlingScrollBarUsingRobotClass(driver);
		wlib.handlingScrollBarUsingRobotClass(driver);
	
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("(//span[text()='Apple iPhone 15 (128 GB) - Black'])/../../../..//div[@class=\"a-section a-spacing-none a-spacing-top-mini s-color-swatch-container-list-view\"]//a"));
		for (WebElement Element : ele) 
		{
			String colors = Element.getAttribute("aria-label");
			  Thread.sleep(2000);
			  System.out.println(colors);
		}
		
	}

}
