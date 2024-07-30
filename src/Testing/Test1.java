package Testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(groups = {"group1"})
	public void runTest1() {
		System.out.println("runtest1");
	}
	
	@Test
	public void runTest2() {
		System.out.println("runtest2");
		System.out.println("runtest3");
		System.out.println("runtest4");
	}
	
	@BeforeTest
	public void prerequiste() {
		System.out.println("Test will execute first");
	}
	
	@AfterTest
	public void lastExecution() {
		System.out.println("Test will execute last");
	}
}
