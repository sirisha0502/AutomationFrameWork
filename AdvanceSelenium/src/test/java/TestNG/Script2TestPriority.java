package TestNG;

import org.testng.annotations.Test;

public class Script2TestPriority 
{
//i will accept positive and negative values also,
//	actually i will follow ansi code and print according to it..so we go for priority
	
	@Test(priority = 1)
	  public void createProductTest()
	  {
		  System.out.println("Product Created");
	  }
	@Test(priority = 2)
		public void modifyProductTest()
		{
			System.out.println("Product Modified");
		}
	@Test(priority = 0)	
		public void deleteProductTest()
		{
			System.out.println("Product Deleted");
		}
}
