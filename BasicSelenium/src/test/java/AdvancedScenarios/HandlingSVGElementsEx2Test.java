package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingSVGElementsEx2Test 
{
     @Test
     public void handlingSVGElements() throws Throwable
     {
    	 WebDriver driver = new ChromeDriver();
 		driver.manage().window().maximize();
 		
 		driver.get("https://www.clinique.in/");
 		//driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//button[text()='OK, ACCEPT ALL']")).click();
 		driver.findElement(By.xpath("//*[name()='svg' and @class=\"ufc-cart-icon-svg\"]")).click();
     }
}
