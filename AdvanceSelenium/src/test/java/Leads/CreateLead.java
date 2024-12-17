package Leads;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import ObjectRepo.LoginVtigerPage;

public class CreateLead {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver;
		File_Utility flib = new File_Utility();
		String BROWSER = flib.getKeyAndValuePair("browser");
		String URL = flib.getKeyAndValuePair("url");
		String USERNAME = flib.getKeyAndValuePair("username");
		String PASSWORD = flib.getKeyAndValuePair("password");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge"))
		{
			driver =new EdgeDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		driver.get(URL);
		//Using Business logic
		LoginVtigerPage login = new LoginVtigerPage(driver);
		login.loginIntoVtiger(USERNAME, PASSWORD);
				
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.cssSelector("[title=\"Create Lead...\"]")).click();
		
		Java_Utility jlib = new Java_Utility();
		int ranNum = jlib.getRandomNum();
		
		Excel_Utility elib = new Excel_Utility();
	    String ldName = elib.readExcelData("Leads",0,0) + ranNum;
		System.out.println(ldName);
		
		driver.findElement(By.name("firstname")).sendKeys(ldName);
		//---------------------------------------------------------------------------------------------------
		

		String ldLastName = elib.readExcelData("Leads",1,0) + ranNum;
		//System.out.println(ldLastName);
		
		driver.findElement(By.name("lastname")).sendKeys(ldLastName);
		//----------------------------------------------------------------------------------------------------------

		String ldCompanyName = elib.readExcelData("Leads",2,0) + ranNum;
		System.out.println(ldCompanyName);
		
		driver.findElement(By.name("company")).sendKeys(ldCompanyName);
		
		driver.findElement(By.cssSelector("[title=\"Save [Alt+S]\"]")).click();
		Thread.sleep(2000);
		String actData = driver.findElement(By.xpath("//span[@id=\"dtlview_First Name\"]")).getText();
		if(actData.contains(ldName))
		{
			System.out.println("Lead name is created");
		}
		else 
		{
			System.out.println("Lead name is not created");
		}
		driver.findElement(By.cssSelector("[src=\"themes/softed/images/user.PNG\"]")).click();
		driver.findElement(By.linkText("Sign Out")).click();
	}

}
