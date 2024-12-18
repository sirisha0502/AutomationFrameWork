package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVGElementsEx2 {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.clinique.in/");
		//driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='OK, ACCEPT ALL']")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @class=\"ufc-cart-icon-svg\"]")).click();
		
		
		
//	public class SVGELement {

	//		public static void main(String[] args) throws Throwable {
				
	/*
	 * WebDriver driver=new ChromeDriver();
	 * 
	 * driver.get("https://www.clinique.in/"); driver.manage().window().maximize();
	 * 
	 * Thread.sleep(2000);
	 * driver.findElement(By.xpath("//button[text()='OK, ACCEPT ALL']")).click();
	 * Thread.sleep(2000); //
	 * driver.findElement(By.cssSelector("[id=\"dismissBtn\"]")).click();
	 * driver.findElement(By.
	 * xpath("//*[name()='svg' and @class=\"ufc-cart-icon-svg\"]")).click();
	 */
			}  

	}

//}
