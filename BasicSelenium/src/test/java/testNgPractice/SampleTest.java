package testNgPractice;

import org.testng.annotations.Test;

public class SampleTest
{
    @Test(invocationCount = 3)
    public void createContact()   //method
    {
    	System.out.println("contact Created");
    }
    @Test
    public void modifyContact()
    {
		System.out.println("contact Modified");
	}
    @Test 
    public void deleteContact() 
    {
		System.out.println("contact Deleted");
	}
}
