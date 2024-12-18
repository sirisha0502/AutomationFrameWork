package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
		//locator1 :- id()
		//syntax1:- AttributeName = "AttributeValue"
		//                    id  = "user-name"
		
	//	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	//	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	//	driver.findElement(By.id("login-button")).click();
		
		//locator2 :- name()
		//syntax2 :- AttributeName="AttributeValue"
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
	    driver.findElement(By.name("password")).sendKeys("secret_sauce");
	    
	    //locator3 :- classname()
	    //syntax3 :- AttributeName="AttributeValue"
	    
	    driver.findElement(By.className("btn_action")).click();
	}

}
