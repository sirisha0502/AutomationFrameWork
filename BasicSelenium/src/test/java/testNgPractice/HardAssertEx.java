package testNgPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx 
{
    @Test
    public void m1()
    {
    	System.out.println("Step1");
    	System.out.println("Step2");
    	Assert.assertEquals(true,true);//when the assertion is passed all the methods will be executed
    	System.out.println("Step3");    //when the assertion is failed it will stop the execution and throws the Assertion error
    	System.out.println("Step4");   //both should be false or both should be true 
    }
    @Test
    public void m2() 
    {
		String expData = "Sirisha";
		String actData = "Sirisha";
		Assert.assertEquals(actData, expData);
	}
}
