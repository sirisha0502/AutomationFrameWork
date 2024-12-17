package TestNG;

import org.testng.annotations.Test;

public class ScriptTestUsingInvocationCount  //executing same method multiple times with the same set of data
{
	@Test(invocationCount = 3)
	public void createProductTest()
    {
	  System.out.println("Product created");
    }
	@Test(invocationCount = 2,priority = -1)
	public void modifyProductTest()
	{
		System.out.println("Product Modified");
	}
	@Test
	public void deleteProductTest()
	{
		System.out.println("Product Deleted");
	}
}
