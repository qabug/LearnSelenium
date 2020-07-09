package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	
	@BeforeSuite
	public void setUp() {
		System.out.println("Setup system property for Chrome");
	}
	

	@BeforeTest
	public void login() {
		System.out.println("Login Method");
	}
	
	@BeforeClass
	
	//Annotations starts with "@"
	public void launchBrowser() {
		System.out.println("Launching Chrome Browser");
	}
	
	@BeforeMethod
	
	
	public void enterURL() {
		System.out.println("Enter URL");
	}
		
	
	
	@Test
	public void googleTitleTest() {
		System.out.println("Google Title Test");
	}
	
	@Test
	public void googleTitleTest2() {
		System.out.println("Google Title Test2");
	}
	
	
	@AfterMethod
	
	public void logout() {
		System.out.println("Logout");
	}
	
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Chrome Browser");
	}
	
	@AfterTest
	
	public void deleteAllCookies() {
		System.out.println("delete all cookies");
	}
	
	
	/*@AfterSuite
	public void generateReport() {
		System.out.println("Generate Test Report");
	}
	
	*/
	
}
