package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingKeysClass {

	public static void main(String[] args) throws Throwable
	{
		// we have 3 approches
		// * Handling dropdown using KeyBoard Strokes-->Keysclass, Robot class
		// * Handling dropdown using select class
		// * Handling dropdown using WebElement
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement daylist = driver.findElement(By.id("day"));
		daylist.click();
	//	daylist.sendKeys(Keys.ARROW_DOWN);
	//  daylist.sendKeys(Keys.ARROW_DOWN);
	//	daylist.sendKeys(Keys.ARROW_DOWN);
	//	daylist.sendKeys(Keys.ARROW_DOWN);
	//	Thread.sleep(2000);
	//	daylist.sendKeys(Keys.ARROW_UP);
	//	daylist.sendKeys(Keys.ARROW_UP);
		
		//Assignment we have to select the date 20-may-2019
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ARROW_DOWN);
		
		WebElement MonthList = driver.findElement(By.id("month"));
        MonthList.click();
        MonthList.sendKeys(Keys.ARROW_UP);
        MonthList.sendKeys(Keys.ARROW_UP);
        MonthList.sendKeys(Keys.ARROW_UP);
	
	   WebElement YearList = driver.findElement(By.id("year"));
	   YearList.sendKeys(Keys.ARROW_DOWN);
	   YearList.sendKeys(Keys.ARROW_DOWN);
	   YearList.sendKeys(Keys.ARROW_DOWN);
	   YearList.sendKeys(Keys.ARROW_DOWN);
	   YearList.sendKeys(Keys.ARROW_DOWN);
	}
}
