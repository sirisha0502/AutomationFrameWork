package testNgPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.t;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakingScreenShot
{
    @Test
	public void m1() throws Throwable 
   {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	//File dest = new File("./failedScript.png");
	// or 
	File dest = new File("C:\\Users\\Sagar\\Desktop\\Selenium\\FileScreenshot.png");
	FileUtils.copyFile(src, dest);
	
   }
}
