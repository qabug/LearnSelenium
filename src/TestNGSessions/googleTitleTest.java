package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class googleTitleTest {

	

	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		WebDriver driver = new FirefoxDriver();	
	
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		

		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("https://www.google.com");//enter URL
	}
	
	@Test
	public void googleTitle() {

		String title= driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google", "Title is Not Matched");
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}
