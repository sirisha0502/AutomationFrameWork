package AdvancedScenarios;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("http://www.amazon.in");
		
//		WebElement element = driver.findElement(By.linkText("Today's Deals"));
//		Actions act = new Actions(driver);    // object creation of object class
//		act.moveToElement(element).perform();  //moveto element it will move the cursor to the element
//		
		//perform is mandatory for performing the mouse actions
		
//		WebElement link = driver.findElement(By.linkText("Mobiles"));
//		Actions act = new Actions(driver);
//		act.contextClick(link).perform();    //contextclick is used for rightclick for mouse pointer
		
//		driver.get("http://www.saucedemo.com/v1/");
//        WebElement UserName = driver.findElement(By.id("user-name"));
//        WebElement Password = driver.findElement(By.name("password"));
//		WebElement login = driver.findElement(By.className("btn_action"));
//		
//		Actions act = new Actions(driver);
//		act.sendKeys(UserName,"standard_user").perform();
//		act.sendKeys(Password,"secret_sauce").perform();
//		act.click(login).perform();
		
		//or
	//	act.sendKeys(UserName,"standard_user").sendKeys(Password,"secret_sauce").click(login).build().perform();
		//if the above actions are not working like this we have to give build() to perform all the actions
		
		//drag and drop
		
//		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
//		WebElement drag = driver.findElement(By.id("draggable"));
//		WebElement drop = driver.findElement(By.id("droppable"));
//	    Actions act = new Actions(driver);
		
	//	act.clickAndHold(drag).release(drop).perform();
		
//		act.dragAndDrop(drag, drop).perform();
		
		// double click option for the action
		
//		driver.get("https://demo.guru99.com/test/simple_context_menu.html ");
//		WebElement element = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//		Actions act= new Actions(driver);
//		act.doubleClick(element).perform();
		
		// movebyoffset is used to close the popup 
		
		driver.get("https://www.makemytrip.com");
		Actions act= new Actions(driver);
		act.moveByOffset(20,40).click().perform();
		
	}

}
