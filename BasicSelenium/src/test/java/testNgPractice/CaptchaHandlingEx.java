package testNgPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.sourceforge.tess4j.Tesseract;

public class CaptchaHandlingEx {

	public static void main(String[] args) throws Throwable 
	{
		ChromeOptions opt = new ChromeOptions();
    	opt.addArguments("--disable-notifications");
  
		WebDriver driver=new ChromeDriver(opt);
        driver.get("https://www.irctc.co.in/nget/train-search");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a[text()=' LOGIN '] ")).click();
       Thread.sleep(1000) ;
      WebElement captcha = driver.findElement(By.xpath("//img[@class=\"captcha-img\"]"));
      Thread.sleep(1000);
      TakesScreenshot ts = (TakesScreenshot)captcha;
      File scr = ts.getScreenshotAs(OutputType.FILE);
      File dest = new File("./captchaScreenshot.png");
      FileUtils.copyFile(scr, dest);
      
      Tesseract tss = new Tesseract();
      tss.setDatapath("\"C:\\Users\\Sagar\\Downloads\\Tess4J-3.4.8-src\\Tess4J\\tessdata\"");
      
      String img = tss.doOCR(dest);
      String captchaimg = img.replaceAll(" ", "");
      
      System.out.println(captchaimg);
      driver.findElement(By.name("captcha")).sendKeys(captchaimg);
      
      
      
	}

}
