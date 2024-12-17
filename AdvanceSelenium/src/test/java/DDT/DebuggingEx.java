package DDT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Demo.Method;

public class DebuggingEx {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		
		Method ele = new Method();
		Method.maximizewindow(driver);
	}

}
