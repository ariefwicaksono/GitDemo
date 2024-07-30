package Testing;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	public void LoginUser() {
		System.out.println("Login User");
	}
	
	@Test
	public void LoginAdmin() {
		System.out.println("Login Admin");
	}
	
	//To skip tc while executing
	@Test(enabled = false)
	public void LoginSuperAdmin() {
		System.out.println("Login Super Admin");
	}
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("I am the number one (before suite) ");
		//changes
		System.out.println("I am the number one (before suite) yesss ");
	}
	
	//It will executed LoginUser first and then LoginClerk
	@Test(dependsOnMethods = "LoginUser")
	public void LoginClerk() {
		System.out.println("Login Clerk");
	}
	
	//Giving timeout to test
	@Test(timeOut = 4000)
	public void LoginUser2() {
		System.out.println("Login User 2");
	}

}
