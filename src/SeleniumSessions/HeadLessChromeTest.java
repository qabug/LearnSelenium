package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "/Users/cmallikarjunap/eclipse-workspace/chromedriver");
		
		ChromeOptions options= new ChromeOptions();
		
		options.addArguments("window-size=1400,800");
		
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);	
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://freecrm.com/");
		
		System.out.println("Login page title: " +driver.getTitle());
		
		driver.findElement(By.cssSelector("a.btn:nth-child(10)")).click();

		driver.findElement(By.name("email")).sendKeys("qabug2020@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Qabug@123");
		driver.findElement(By.cssSelector("div[class='ui fluid large blue submit button']")).click();
		
		System.out.println("page title after login: " +driver.getTitle());
	}

}
