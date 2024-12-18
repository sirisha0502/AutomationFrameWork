package Popups;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopup {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.makemytrip.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 20).click().perform(); 
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(1000);
		
	/*	Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);   //scroll bar code
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);     */
		
	      driver.findElement(By.xpath("//div[text()='September 2024']/../..//p[text()='5']")).click();
		//driver.findElement(By.xpath("//div[text()='September 2024']/ancestor::div[@class='DayPicker-Month']//p[text()='10']")).click();
	
	   // driver.findElement(By.xpath("//div[text()='September 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='7']")).click();
	
		//Dynamic xpath :-the path remains same ,any value changes should be done out side the path
		
	/*	String month = "August 2024";//if it not work bcoz of scrolling we have to write scrollbar code
		String date = "30";
		driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
	               */
	//	String month1 = "September 2024";   //ancestor for backward traversing instead of /.., descendant for forward trav instead of // 
	//	String date1 = "20";
	//	driver.findElement(By.xpath("//div[text()='"+month1+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date1+"']")).click();
	}
//child family to any parent--->ancestor
//parent to any child --->descendant	
}
