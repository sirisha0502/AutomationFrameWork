package Assigments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic_Utilities.WebDriver_Utility;

public class ProKabadiSchedule {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		WebDriver_Utility wlib = new WebDriver_Utility();
		
		wlib.maximizeWindow(driver);
		driver.get("https://www.google.com/search?q=pro+kabaddi+schedule&oq");
		
//		String team1Name = driver.findElement(By.xpath("//span[text()='Puneri Paltan' and @class=\"tsp-db tsp-el tsp-flr tsp-fm\"]")).getText();
//		System.out.println("Team1Name:"+team1Name);
//		
//		String team2Name = driver.findElement(By.xpath("//span[text()='Jaipur Pink Panthers' and @class=\"tsp-db tsp-el tsp-flr tsp-fm\"]")).getText();
//		System.out.println("Team2Name :"+team2Name);
//		
//		String timings = driver.findElement(By.xpath("//span[text()='8:00 pm']")).getText();
//		System.out.println("Timinings :"+timings);
		
		List<WebElement> Todays = driver.findElements(By.xpath("//span[text()='today']//ancestor::div[@class='tsp-fr tsp-fs tsp-cpd tsp-rpd tsp-cbd']"));
		List<WebElement> Timings = driver.findElements(By.xpath("//span[text()='today']/../../../../..//div[@class=\"tsp-frs tsp-pl4\"]"));

		for(WebElement today:Todays)
		{
			List<WebElement> Spans = driver.findElements(By.xpath("//span[text()='today']//ancestor::div[@class='tsp-fr tsp-fs tsp-cpd tsp-rpd tsp-cbd']//descendant::span"));
			int i=0;
			for(WebElement eachspan:Spans)
			{
				
				System.out.print(eachspan.getText()+"\t");
				i++;
				if(i==8)
					System.out.println();
			}
			
		}
		
		Thread.sleep(1000);
		driver.quit();
	}

}
