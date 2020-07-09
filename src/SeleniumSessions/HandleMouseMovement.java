package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleMouseMovement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.get("https://www.spicejet.com/");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
	
		
		driver.findElement(By.linkText("SpiceMax")).click();
		
		driver.quit();
		
	}

}
