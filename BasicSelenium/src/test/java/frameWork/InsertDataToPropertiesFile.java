package frameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertDataToPropertiesFile {

	public static void main(String[] args) throws Throwable
	{
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
        //step1:-connecting the physical file path to the script
		FileInputStream fis = new FileInputStream("./src/test/resources/CommonData9.properties.txt");
		Properties pro = new Properties();
		/*pro.load(fis);
		
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();     */
		
		pro.setProperty("url", "https://www.saucedemo.com/v1/");
		pro.setProperty("username", "standard_user");
		pro.setProperty("password", "secret_sauce");
		
	//	FileOutputStream fos = new FileOutputStream("C:\\Users\\Sagar\\Desktop\\Selenium\\Data1.properties.txt");
		// or  
		FileOutputStream fos = new FileOutputStream("./src/test/resources/CommonData9.properties.txt");
		pro.store(fos,"Data");
		
	}

}
