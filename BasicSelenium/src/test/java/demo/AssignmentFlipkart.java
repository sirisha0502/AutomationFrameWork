package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFlipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.in/");
		driver.findElement(By.cssSelector("[src='https://rukminim2.flixcart.com/flap/80/80/image/22fddf3c7da4c4f4.png?q=100']")).click();
		driver.findElement(By.cssSelector("[class='suthUA']")).click();
	}

}
