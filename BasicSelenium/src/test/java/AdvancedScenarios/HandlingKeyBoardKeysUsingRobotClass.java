package AdvancedScenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardKeysUsingRobotClass {

	public static void main(String[] args) throws Throwable
	{
		//  using Robot keys for select the username,copy it and paste it in password field
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.saucedemo.com/v1/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);   //select all (Ctrl+A)
		rob.keyPress(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_CONTROL);       //for copying(Ctrl+C)
		rob.keyPress(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_C);
		
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_TAB);       //for going to next line TAB
		rob.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_CONTROL);    //for pasting the copied text(Ctrl+V)
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
		
	}

}
