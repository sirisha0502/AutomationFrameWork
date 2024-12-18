package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPopupEx2 {

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Frames.html");
	//Approach 1:----> Switching frame using Index
		
	//	driver.switchTo().frame(0);
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("MoukiRuthvi");
	
	//Approach 2:----> Switching frame using ID Attribute
		
	//	driver.switchTo().frame("singleframe"); //Using id
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sagar");
		
	//	driver.switchTo().frame("SingleFrame"); // Using name
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sirisha");

	//Approach 3:----> Switching frame using WebElement
		
		WebElement frame= driver.findElement(By.cssSelector("[id=\"singleframe\"]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sirisha");
		
		
	}

}
