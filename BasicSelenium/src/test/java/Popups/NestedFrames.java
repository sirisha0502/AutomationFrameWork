package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		
		//driver.switchTo().frame(2);//this will not work because it is an inner frame in this case we should go to 2nd or 3rd approach
	  //  WebElement TopFrame = driver.findElement(By.xpath("//frame[@name=\"frame-top\"]"));
	//	driver.switchTo().frame(TopFrame);
		
		//or
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-left"); // Using name
		String leftframe = driver.findElement(By.xpath("//body[contains(text(),'  LEFT')]")).getText();
		System.out.println(leftframe);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-middle");
    	String MiddleFrame = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
		System.out.println(MiddleFrame);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-right");
		String RightFrame = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();
		System.out.println(RightFrame);
		
		driver.switchTo().defaultContent();//where ever ur it will come back to the main frame
		driver.switchTo().frame("frame-bottom");
		String Bottom = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
	    System.out.println(Bottom);
	
	
	}

}
