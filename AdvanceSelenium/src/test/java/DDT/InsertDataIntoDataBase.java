package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertDataIntoDataBase {

	public static void main(String[] args) throws Throwable
	{
		//step 1:- register or load mysql database
		Driver refDriver = new Driver();
		DriverManager.registerDriver(refDriver);
				
		//step2: get connection to database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info", "root", "sirisha@123");
		
		Statement state = conn.createStatement();
		String Query = "insert into students(id,first_name,last_name,address)values('8','Alekya','B','Hyderabad')";
		
		int result = state.executeUpdate(Query);
		
		if(result==1)
		{
			System.out.println("data is passed");
		}
		else
		{
			System.out.println("data is not passed");
		}
		conn.close();
	}

}
