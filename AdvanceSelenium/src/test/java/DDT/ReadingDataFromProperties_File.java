package DDT;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDataFromProperties_File 
{

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		//FileInputStream fis = new FileInputStream("C:\\Users\\Sagar\\Desktop\\AdvanceSelenium\\CommonData11.properties.txt");
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData11.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		driver.get(URL);
		driver.findElement(By.name("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();
		
	}

}
