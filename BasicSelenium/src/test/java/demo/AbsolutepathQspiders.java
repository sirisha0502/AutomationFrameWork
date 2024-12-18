package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsolutepathQspiders 
{

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chat.qspiders.com/student-dashboard");
		
		driver.findElement(By.cssSelector("[placeholder=\"Enter Number / Email\"]")).sendKeys("8088474745");
		driver.findElement(By.cssSelector("[placeholder=\"Enter password\"]")).sendKeys("Sirisha@123");
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div[1]/section[2]/article/aside[2]/div/section/article/aside[1]/div[3]/div[1]/span/input")).sendKeys("shobha Rani B N");
        driver.findElement(By.cssSelector("[placeholder=\"Search\"]")).click();
	}

}
