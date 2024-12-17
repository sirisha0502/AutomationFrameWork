package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx 
{
	@Test
  public void m1()    //passed assertion
  {
		System.out.println("Step1");
		System.out.println("Step2");
		
		Assert.assertEquals(false, false);
		
		System.out.println("Step3");
		System.out.println("Step4");
  }
	@Test
	public void m2()   
	{
		String expData = "qspiders";
		String actData ="qspiders";
		Assert.assertEquals(expData, actData);
	}
	
	@Test
	public void m3()
	{
		int a=10;
		int b=10;
		Assert.assertEquals(a, b, "Not Equals =");
		System.out.println("it is equal");
	}
	@Test
	public void m4()
	{
		int a= 10;
		int b =10;
		Assert.assertNotEquals(a, b,"It is Equal");
		System.out.println("It is not equal");
	}
		@Test
	public void m5()
	{
		String s1="Sirisha";
		String s2="Sirisha";
		Assert.assertTrue(s1.equalsIgnoreCase(s2), "False =");
		System.out.println("True==");
	}
		@Test
		public void m6()
		{
			String s1="Sirisa";
			String s2="Sirisha";
			Assert.assertFalse(s1.equalsIgnoreCase(s2), "Equals==");
			System.out.println("data is not equal");
		}
		@Test
		public void m7()
		{
			String s =null;
			Assert.assertNull(s, "it is not null");
			System.out.println("it is null");
		}
		@Test
		public void m8()
		{
			String s ="hello";
			Assert.assertNull(s, "it is not null");
			System.out.println("it is null");
		}
		@Test
		public void m9()
		{
			String s ="hello";
			Assert.assertNotNull(s, "it is null");
			System.out.println("it is not null");
		}
		@Test
		public void m10()
		{
			String s1 ="hello";
			String s2 ="hello";
			Assert.assertSame(s1,s2, "not same");
			System.out.println("it is same");
		}
		@Test
		public void m11()
		{
			String s1 ="hell";
			String s2 ="hello";
			Assert.assertNotSame(s1,s2, "same");
			System.out.println("it is not same");
		}
		@Test
		public void m12()
		{
			Assert.fail("Im failing the TestSCript");
		}
}
