package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Sagar\\Desktop\\Selenium\\dependencies.txt");

        driver.findElement(By.cssSelector("[type=\"submit\"]")).click();

//WebElement file = driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
//
//file.sendKeys("C:\\Users\\Sagar\\Desktop\\Selenium\\dependencies.txt");
//driver.findElement(By.xpath("//input[@value=\"Upload\"]")).click();

	}

}
