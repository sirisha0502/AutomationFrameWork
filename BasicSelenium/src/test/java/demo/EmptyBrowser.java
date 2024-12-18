package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmptyBrowser 
{
 public static void main(String[] args)
 {
	//selenium version : 3.141.59   webDriverManager:  5.9.1
	 
	 //WebDriverManager.chromedriver().setup();
	// WebDriver driver = new ChromeDriver();
	 
	// WebDriverManager.edgedriver().setup();
	// WebDriver driver = new EdgeDriver();
	 

//	 WebDriver driver = new EdgeDriver();
	 
   WebDriver driver = new ChromeDriver(); 
 }
}
