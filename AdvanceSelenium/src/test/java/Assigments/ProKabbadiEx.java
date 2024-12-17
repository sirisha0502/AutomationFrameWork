package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_Utilities.WebDriver_Utility;

public class ProKabbadiEx {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		WebDriver_Utility wlib = new WebDriver_Utility();
		
		wlib.maximizeWindow(driver);
		driver.get("https://www.prokabaddi.com/standings");
		
		wlib.waitForPageToLoad(driver);
		
		String played = driver.findElement(By.xpath("//p[text()='Bengal Warriorz']/../../../..//div[@class='table-data matches-play']")).getText();
		System.out.println("Played :"+played);
       
		String won = driver.findElement(By.xpath("//p[text()='Bengal Warriorz']/../../../..//div[@class='table-data matches-won']")).getText();
		System.out.println("Won :"+won);
		
		String lost = driver.findElement(By.xpath("//p[text()='Bengal Warriorz']/../../../..//div[@class='table-data matches-lost']")).getText();
		System.out.println("lost :"+lost);
		
		String draw = driver.findElement(By.xpath("//p[text()='Bengal Warriorz']/../../../..//div[@class='table-data matches-draw']")).getText();
		System.out.println("Draw :"+draw);
		
		String scorediff = driver.findElement(By.xpath("//p[text()='Bengal Warriorz']/../../../..//div[@class='table-data score-diff']")).getText();
		System.out.println("Scorediff :"+scorediff);
		
        String form1 = driver.findElement(By.xpath("//p[text()='Bengal Warriorz']/../../../..//ul//li[1]")).getText();
		System.out.println("Form1 :"+form1);
		
		String form2 = driver.findElement(By.xpath("//p[text()='Bengal Warriorz']/../../../..//ul//li[2]")).getText();
		System.out.println("Form2 :"+form2);
		
		String form3 = driver.findElement(By.xpath("//p[text()='Bengal Warriorz']/../../../..//ul//li[3]")).getText();
		System.out.println("Form3 :"+form3);
		
		String form4 = driver.findElement(By.xpath("//p[text()='Bengal Warriorz']/../../../..//ul//li[4]")).getText();
		System.out.println("Form4 :"+form4);
		
		String form5 = driver.findElement(By.xpath("//p[text()='Bengal Warriorz']/../../../..//ul//li[5]")).getText();
		System.out.println("Form5 :"+form5);
        
		String points = driver.findElement(By.xpath("//p[text()='Bengal Warriorz']/../../../..//div[@class='table-data points']")).getText();
		System.out.println("Points :"+points);

	}

}
