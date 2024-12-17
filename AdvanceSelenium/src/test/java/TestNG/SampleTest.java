package TestNG;

import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;

public class SampleTest extends BaseClass
{
@Test
     public void m1()
     {
	  System.out.println("I m Test");
     }
@Test
     public void m2()
     {
        System.out.println("I m Test2");	 
     }
}
//two times the browser is launching without closing the browser