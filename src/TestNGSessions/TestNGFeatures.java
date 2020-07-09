package TestNGSessions;

import org.testng.annotations.Test;

public class TestNGFeatures {

	@Test(priority=1, groups="PrintLine")
	public void Test1() {

		System.out.println("Login");
	}
	@Test(priority=1, groups="PrintLine")
	public void Test2() {

		System.out.println("Home");
	}
	@Test(priority=1, groups="PrintLine")
	public void Test3() {

		System.out.println("Search");
	}
	
	
}
