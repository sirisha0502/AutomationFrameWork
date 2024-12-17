package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class InsertDataToPropertiesFile {

	public static void main(String[] args) throws Throwable
	{
		//FileInputStream fis = new FileInputStream("./src/test/resources/CommonData11.properties.txt");
		FileInputStream fis = new FileInputStream("C:\\Users\\Sagar\\Desktop\\AdvanceSelenium\\CommonData11.properties.txt");
		Properties pro = new Properties();
		
		pro.setProperty("url", "https://www.saucedemo.com/v1/");
		pro.setProperty("username", "standard_user");
		pro.setProperty("password", "secret_sauce");
		
		//FileOutputStream fos = new FileOutputStream("./src/test/resources/CommonData11.properties.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Sagar\\Desktop\\AdvanceSelenium\\CommonData11.properties.txt");
		pro.store(fos,"Sirisha");
	}

}
