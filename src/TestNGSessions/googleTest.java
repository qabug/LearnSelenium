package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class googleTest {

	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		WebDriver driver = new FirefoxDriver();	
	
		driver.manage().window().maximize();//maximize the window
		driver.get("https://www.google.com");//enter URL
		driver.manage().deleteAllCookies();//delete all cookies
		

		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}
	
	@Test(priority=4, groups="Link Test")
	public void googleTitleTest() {

		String title= driver.getTitle();
		System.out.println(title);
	}
	@Test(dependsOnMethods="googleTitleTest", groups="PrintLine")
	public void Test1() {

		System.out.println("Test1");
	}
	@Test(priority=2, groups="PrintLine")
	public void Test2() {

		System.out.println("Test2");
	}
	@Test(priority=1, groups="PrintLine")
	public void Test3() {

		System.out.println("Test3");
	}
	
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	
}
