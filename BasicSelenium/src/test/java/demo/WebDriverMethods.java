package demo;

import java.awt.Window;
import java.lang.StackWalker.Option;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver(); //code for launching the web browser
      
      //method1
      driver.get("https://www.amazon.in");
      
      //method2  ---> to get the title of the webpage
     //String title = driver.getTitle();
     //System.out.println(title);
      
      System.out.println(driver.getTitle());
      
      //method 3 --->get the current url
      
     // String Url = driver.getCurrentUrl();
     //System.out.println(Url);
      
      System.out.println(driver.getCurrentUrl());
      
      //method 4 ---> to get the pagesource
     // System.out.println(driver.getPageSource());
      
      //method 5 ---> to maximize the window
      
    //  Options opt = driver.manage();
    //  Window win = opt.window();
    //  win.maximize();
      
    // driver.manage().window().maximize();  // to maximize the window
     
    // driver.manage().window().minimize();  // to minimize the window
     
    //  driver.manage().window().fullscreen();  // to get fullscreen
     
     //method 6
     driver.close(); // closing a single tab or window
     
     // method 7
     
     driver.quit();   // it closes all the tabs including browser
	}

}
