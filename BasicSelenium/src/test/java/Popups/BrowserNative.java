package Popups;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserNative {

	public static void main(String[] args) 
	{
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.in");
		
//		EdgeOptions opt = new EdgeOptions();
//		opt.addArguments("InPrivate browsing");
//		
//		EdgeDriver driver = new EdgeDriver(opt);
//		driver.get("https://www.bing.com/");
	}

}
