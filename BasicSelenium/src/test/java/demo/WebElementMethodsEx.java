package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsEx {

	public static void main(String[] args) throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.saucedemo.com/v1/");
		
		//Method 1 --> sendkeys()
		WebElement UserName = driver.findElement(By.name("user-name"));
		UserName.sendKeys("standard_user");
		
		//Method 2 --> clear()
		Thread.sleep(2000);
		UserName.clear();
		
		UserName.sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		//Method 3 --> click()       
		driver.findElement(By.id("login-button")).click();*/
		
		driver.get("https://www.amazon.in");
	/*	//Method 4 -->getcssvalue()
		WebElement ele = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		//System.out.println(ele.getCssValue("color"));
		
		WebElement eles = driver.findElement(By.id("nav-logo-sprites")); //amazon logo
		System.out.println(eles.getCssValue("color"));
		System.out.println(eles.getCssValue("font-size")); */
		
		//method 5 -->getlocation()
	//	WebElement phone = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	//	System.out.println(phone.getLocation().getX());
	//	System.out.println(phone.getLocation().getY());
		
		//Method 6--> getSize()
	//	WebElement search = driver.findElement(By.name("field-keywords")); //searchbar name
	//	System.out.println(search.getSize().getHeight());
	//	System.out.println(search.getSize().getWidth());
		
	/*	//Method 7 --> getRect()
		WebElement phone = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		System.out.println(phone.getRect().getX());
		System.out.println(phone.getRect().getY());
		System.out.println(phone.getRect().getHeight());
		System.out.println(phone.getRect().getWidth());    */
		
	/*	WebElement link = driver.findElement(By.linkText("Amazon miniTV"));
		
		//Method 8-->isDisplayed()
		if (link.isDisplayed())
		{
			System.out.println("Element is displayed");
		}
		else
		{
			System.out.println("Element is not displayed");
		}
		
		//Method 9 -->isEnabled()
		WebElement search = driver.findElement(By.name("field-keywords"));
		
		if(search.isEnabled())
		{
			search.sendKeys("Nike");
		}
		else
		{
			System.out.println("Element is not enabled");
		}    */
		
		//Method 10 --> isSelected()
	/*	driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
		radio.click();
		if (radio.isSelected())
		{
		  System.out.println("radio button is selected");	
		}
		else
		{
			System.out.println("radio button is not Selected");
		}                                                          */
		
		//driver.get("https://www.flipkart.com");
		//getAttribute()
		//getDomAttribute()
		//getDomProperty()
		
		//Method 11,12,13 --->getAttribute(), getDomAttribute(),getDomProperties() 
	//    WebElement searchBar = driver.findElement(By.name("q"));    //search bar
	//    System.out.println(searchBar.getAttribute("class"));
	//    System.out.println(searchBar.getDomAttribute("placeholder"));
	//    System.out.println(searchBar.getDomProperty("nodeName"));
	//    System.out.println(searchBar.getDomProperty("offsetHeight"));
	    
	  //  WebElement logo = driver.findElement(By.xpath("//img[@title='Flipkart']"));
	 //  System.out.println(logo.getAttribute("src"));
	    
		
		//Method 14 -->tagname()
		
	//	WebElement searchBar = driver.findElement(By.name("q"));  
    //	System.out.println(searchBar.getTagName());
		
	//    WebElement offer = driver.findElement(By.xpath("//span[text()='Top Offer']"));   
	//    System.out.println(offer.getTagName());
		
		//Method 15-->getAccessibleName()
		
	//	WebElement mini = driver.findElement(By.cssSelector("[data-csa-c-slot-id=\"nav_cs_1\"]")); //Amazon mini Tv
	 //   System.out.println(mini.getAccessibleName());
		
		//Method 16 --> getAriaRole()
		
	//	WebElement mini = driver.findElement(By.cssSelector("[data-csa-c-slot-id=\"nav_cs_1\"]"));
	//	System.out.println(mini.getAriaRole());
		
	//	WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox")); //amazon
	//	System.out.println(searchBar.getAriaRole());
		
		//Method 17 --> submit()
		 WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		 search.sendKeys("Bluetooth");
		 search.submit();
		 
	  //Method 18 --> getText()
		 String price = driver.findElement(By.xpath("//span[text()='749']")).getText();
		 System.out.println(price);
		
		
		
		
	}

}
