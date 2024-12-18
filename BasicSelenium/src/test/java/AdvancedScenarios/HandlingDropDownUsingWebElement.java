package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingWebElement {

	public static void main(String[] args)throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//option[text()='18']")).click();
		driver.findElement(By.xpath("//option[@value='16']")).click();
		driver.findElement(By.xpath("//option[text()='Mar']")).click();
		driver.findElement(By.xpath("//option[@value='1980']")).click();

	}

}
