package testing_basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Concepts_DataProvider
{
	@Test(dataProvider = "getData")
	public void RegisterNewUser(String user,String browser,String PANCARD, int userid)
	{
		
	}
	
	@DataProvider
	
	public Object[][] getData()
	{
		Object[][] data = new Object[3][4];
		
		data[0][0]="User1";
		data[0][1]="Chrome";
		data[0][2]="APERE1234";
		data[0][3]=121;
		
		data[1][0]="User2";
		data[1][1]="Edge";
		data[1][2]="APERE1235";
		data[1][3]=122;
		
		data[2][0]="User3";
		data[2][1]="FireFox";
		data[2][2]="APERE1236";
		data[2][3]=123;
		
		return data;
	
}
}
