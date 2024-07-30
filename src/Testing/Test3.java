package Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void webMenu() {
		System.out.println("WEB Menu");
	}
	
	@Test
	public void appMenu() {
		System.out.println("APP Menu");
	}
	
	@Test
	public void appMenu2() {
		System.out.println("APP Menu");
	}
	
	@Test(groups = {"group1"})
	public void ApiMenu() {
		System.out.println("Api Menu");
	}
	
	@Parameters({"URL","Wasap"})
	@AfterSuite
	public void AfterSuite(String balabala, String Wasapp) {
		System.out.println("I am the last executed (after suite)");
		System.out.println(balabala);
		System.out.println(Wasapp);
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("I will executed before every method in test3 class");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before executing any method in class");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("After executing all method in class");
	}
	

}
