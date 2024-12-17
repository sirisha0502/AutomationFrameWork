package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1  //executing same set of data multiple times
{
	@Test(dataProvider = "getData")
  public void bookTickets(String src, String dest ,int numofPpl)
  {
	System.out.println("Book tickets from "+src+" to "+dest +","+numofPpl);
  }
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[3][3];
		
		obj[0][0] = "Bangalore";
		obj[0][1] = "Goa";
		obj[0][2] = 2;
		
		obj[1][0] = "Bangalore";
		obj[1][1] = "Mysore";
		obj[1][2] =  3;
		
		obj[2][0] = "Bangalore";
		obj[2][1] = "Chennai";
		obj[2][2] = 4;
		return obj;
	}
	
}
