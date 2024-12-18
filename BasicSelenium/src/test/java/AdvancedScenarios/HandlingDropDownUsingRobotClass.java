package AdvancedScenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingRobotClass {

	public static void main(String[] args) throws Throwable
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement daylist = driver.findElement(By.id("day"));
		daylist.click();
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_UP);
        rob.keyRelease(KeyEvent.VK_UP);
		
        Thread.sleep(2000);
		WebElement MonthList = driver.findElement(By.id("month"));
        MonthList.click();
        rob.keyPress(KeyEvent.VK_DOWN);
        rob.keyRelease(KeyEvent.VK_DOWN);
        
        rob.keyPress(KeyEvent.VK_DOWN);
        rob.keyRelease(KeyEvent.VK_DOWN);
        
        rob.keyPress(KeyEvent.VK_DOWN);
        rob.keyRelease(KeyEvent.VK_DOWN);
        
        Thread.sleep(2000);
        WebElement YearList = driver.findElement(By.id("year"));
        YearList.click();
        rob.keyPress(KeyEvent.VK_DOWN);
        rob.keyRelease(KeyEvent.VK_DOWN);
        
        rob.keyPress(KeyEvent.VK_DOWN);
        rob.keyRelease(KeyEvent.VK_DOWN);
        
        rob.keyPress(KeyEvent.VK_DOWN);
        rob.keyRelease(KeyEvent.VK_DOWN);
        
		

	}

}
