package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) throws Throwable
	{
		
//Approach1:- close the notification		
//		ChromeOptions opt = new ChromeOptions();
//    	opt.addArguments("--disable-notifications");
//  
//		WebDriver driver=new ChromeDriver(opt);
//        driver.get("https://www.irctc.co.in/nget/train-search");
//		
//Approach2:-		

	  WebDriver driver = new ChromeDriver();
      driver.get("https://www.irctc.co.in/nget/train-search");
      
      Robot rob = new Robot();
      rob.keyPress(KeyEvent.VK_TAB);
      rob.keyRelease(KeyEvent.VK_TAB);
     
      rob.keyPress(KeyEvent.VK_TAB);
      rob.keyRelease(KeyEvent.VK_TAB);
     
      rob.keyPress(KeyEvent.VK_TAB);
      rob.keyRelease(KeyEvent.VK_TAB);
     
      		
      rob.keyPress(KeyEvent.VK_ENTER);
      rob.keyRelease(KeyEvent.VK_ENTER);
	}
}


