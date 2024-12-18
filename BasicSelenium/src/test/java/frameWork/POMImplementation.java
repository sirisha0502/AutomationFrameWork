package frameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectRepo.LoginPage;

public class POMImplementation {
   //Avoid hardcoring of locators /elements/Objects
	//Create a separate Java class (POM class to store all the webelements
	//driver.findelement() should be avoided in testScript
	//POM classes we should be created ---->No of webpages = No of POM classes
	
	public static void main(String[] args) throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//step 1:-connecting the physical file path to the script
				FileInputStream fis = new FileInputStream("C:\\Users\\Sagar\\Desktop\\Selenium\\CommonData9.properties.txt");
				
				//step 2:- load all the keys present in properties file
				Properties pro = new Properties();
				pro.load(fis);
				
				String URL = pro.getProperty("url");
				String USERNAME = pro.getProperty("username");
				String PASSWORD = pro.getProperty("password");
				
				driver.get(URL);
				//driver.findElement(By.id("user-name")).sendKeys(USERNAME);
				//driver.findElement(By.id("password")).sendKeys(PASSWORD);
				//driver.findElement(By.id("login-button")).click();
		
				
		//Implemented using getter method		
	//	LoginPage login = new LoginPage(driver);
	//	login.getUserTextField().sendKeys(USERNAME);
	//	login.getPasswordTextField().sendKeys(PASSWORD);
	//	login.getLoginButton().click();
		
				//Impelemented using Business logic
			LoginPage login = new LoginPage(driver);
			login.loginToApplication(USERNAME, PASSWORD);
	}

}
