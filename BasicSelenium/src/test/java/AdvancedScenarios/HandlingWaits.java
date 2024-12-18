package AdvancedScenarios;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWaits {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
		//version 3:-
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
		
		//version 4:- Syntax
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		
		//explicit wait
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.elementToBeClickable(login));
	//	login.click();
		
	//	String ele = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
	//	wait.until(ExpectedConditions.titleContains("Swag Labs"));
	//	System.out.println(ele);

		// Fluent wait ---> customized wait
		FluentWait wait1 = new FluentWait(driver);
		wait1.pollingEvery(Duration.ofSeconds(2));
		wait1.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		
	}

}
