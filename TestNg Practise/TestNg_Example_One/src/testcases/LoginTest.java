package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

	@Test(dataProvider="getData")
	public void doLoginTest(String userName,
			String Password,
			String result,
			String browser){
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data= new Object[2][4];
		data[0][0]="U1";
		data[0][1]="P1";
		data[0][2]="pass";
		data[0][3]="Mozilla";
		
		data[1][0]="U1";
		data[1][1]="P1";
		data[1][2]="pass";
		data[1][3]="Google";

		return data;
		
	}
}
