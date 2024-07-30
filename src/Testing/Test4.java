package Testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 {
	
	
	
	@Test(groups = {"group1"})
	public void LogOutUser() {
		System.out.println("Log out user");
	}
	
	@Parameters({"URL"})
	@Test
	public void LogOutAdmin(String urlname) {
		System.out.println("Log out admin");
		System.out.println(urlname);
	}
	
	@Test
	public void LogOutSuperAdmin() {
		System.out.println("Log out super admin");
	}
	
	@Test
	public void LogOutSuperAdmin2() {
		System.out.println("Log out super admin");
	}
	
	@Test(dataProvider = "getData")
	public void ChooseProile(String username, String password) {
		System.out.println("Choose profile");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st uname|pass - silver member
		//2nd uname|pass - gold member
		//3rd uname|pass - diamond member
		
		/*3 rows and 2 column array [Rows][Column]*/
		Object[][] data = new Object[3][2];
		
		//1st set | 1st row
		data [0][0] = "firstUname";
		data [0][1] = "firstPass";
		
		//2st set | 2nd row
		data [1][0] = "secondUname";
		data [1][1] = "secondPass";
		
		//3rd set | 3rd row
		data [2][0] = "ThirdUname";
		data [2][1] = "ThirdPass";
		
		return data;
	}
}
