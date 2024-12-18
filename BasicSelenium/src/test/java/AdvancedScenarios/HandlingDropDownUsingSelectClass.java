package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelectClass {

	public static void main(String[] args) throws Throwable
	{
		// Three Approach]---->click action is not required in select class
		//Select by index
		//select by Value
		// Select by visibleText
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		//10/dec/2000 select by index
		//05/feb/1985 select by value
		//30/jun/1996 select by visible text
		
		WebElement daylist = driver.findElement(By.id("day"));
		Select select = new Select(daylist);
		//select.selectByIndex(9);
		//select.selectByValue("5");
		select.selectByVisibleText("30");
		
		WebElement Monthlist = driver.findElement(By.id("month"));
		Select select1 = new Select(Monthlist);
		//select1.selectByIndex(11);
		//select1.selectByValue("2");
		select1.selectByVisibleText("Jun");
		
		WebElement Yearlist = driver.findElement(By.id("year"));
		Select select2 = new Select(Yearlist);
		//select2.selectByIndex(24);
		//select2.selectByValue("1985");
		select2.selectByVisibleText("1996");
	}
}
