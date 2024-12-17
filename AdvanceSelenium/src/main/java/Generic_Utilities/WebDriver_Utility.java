package Generic_Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class WebDriver_Utility 
{
	/**
	 * This Method is used for maximizing the window
	 * @param driver
	 */
   public void maximizeWindow(WebDriver driver)
   {
	   driver.manage().window().maximize();
   }
   /**
    * This Method is used for wait for page to load
    * @param driver
    */
   public void waitForPageToLoad(WebDriver driver)
   {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
   }
   /**
    * This Method is used to switch windows
    * @param driver
    * @param partialTitle
    */
   public void windowSwitching(WebDriver driver, String partialTitle)
   {
	   Set<String> allWins = driver.getWindowHandles();
		Iterator<String> id = allWins.iterator();

		while (id.hasNext()) 
		{
			String win = id.next();
			driver.switchTo().window(win);
			String title = driver.getTitle();
			if (title.contains(partialTitle))

			{
				break;
			}
		}
   }
   /**
    * This Method is used for AlterPopUp
    * @param driver
    */
	 public void AlertAccept(WebDriver driver)
	 {
		 Alert alt = driver.switchTo().alert();
		 alt.accept();
	 }
	 /**
	  * This method is used for handlingScrollBarUsingRobotClass(WebDriver driver) throws Throwable
	  * @param driver
	  * @throws Throwable
	  */
	 public void handlingScrollBarUsingRobotClass(WebDriver driver) throws Throwable
	 {
		 Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
	 }
	 public void alertAccept(WebDriver driver)
	 {
			driver.switchTo().alert().accept();
		}

		public void screenShot()
		{
			TakesScreenshot ts = (TakesScreenshot) BaseClass.sdriver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dst = new File("./ScreenShots/image.png");
			try 
			{
				FileUtils.copyFile(src, dst);
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

	public static String takeScreenShot1(WebDriver driver, String screenShotName) throws Throwable 
	{
			TakesScreenshot takesSceenShot = (TakesScreenshot) driver;
			File src = takesSceenShot.getScreenshotAs(OutputType.FILE);
			File dst = new File("./ScreenShots/" + screenShotName +".png");
			FileUtils.copyFile(src, dst);
			return dst.getAbsolutePath();
		}

   }
   


