package TestNG;

import org.testng.annotations.Test;

@Test 
//for executing all the classes at a time
public class Script1Test
 {
    public void createProductTest()
    {
	  System.out.println("Product created");
    }
	
	public void modifyProductTest()
	{
		System.out.println("Product Modified");
	}
	
	public void deleteProductTest()
	{
		System.out.println("Product Deleted");
	}
}
