package TestNG;

import org.testng.annotations.Test;

public class ScriptTestUsingEnabled                //used to skip the method without execution
{
	@Test
	public void createProductTest()
    {
	  System.out.println("Product created");
    }
	@Test
	public void modifyProductTest()
	{
		System.out.println("Product Modified");
	}
	@Test(enabled = false)
	public void deleteProductTest()
	{
		System.out.println("Product Deleted");
	}
}
