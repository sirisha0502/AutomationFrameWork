package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("bluetooth");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	//String hi =	driver.findElement(By.xpath("//a[@title='Aroma NB119B Badshah 60 Hours Playing Time Fast Charging Bluetooth Neckband Earphone Bluetooth Gaming Headset']")).getText();
		//System.out.println(hi);
		
		//xpath by text()
		//htmltag[text()='AttributeValue']
		//driver.findElement(By.xpath("span[text()='Login']")).click();
		
		//driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
	//	String name = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Pink, 128 GB)']")).getText();
		//System.out.println(name);
		//String name1 =driver.findElement(By.xpath("//div[text()='₹66,699']")).getText();
	//	System.out.println(name1);
	}

}
