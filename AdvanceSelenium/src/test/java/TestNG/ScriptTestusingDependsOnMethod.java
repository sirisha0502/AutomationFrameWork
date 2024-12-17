package TestNG;

import org.testng.annotations.Test;

public class ScriptTestusingDependsOnMethod   //depends on method will be the 1st priority
{
	@Test
	public void createProductTest()
    {
	  System.out.println("Product created");
    }
	@Test(priority = 0,dependsOnMethods   = "createProduct")
	public void modifyProductTest()
	{
		System.out.println("Product Modified");
	}
	@Test(dependsOnMethods = "createProduct")
	public void deleteProductTest()
	{
		System.out.println("Product Deleted");
	}
}
