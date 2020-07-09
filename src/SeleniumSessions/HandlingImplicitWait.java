package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingImplicitWait {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.get("https://www.spicejet.com/");
		
		//driver.switchTo().frame(0);
		
		//code to perform  multiple layer of mouse movement
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();
		action.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
		driver.findElement(By.linkText("Member Login")).click();
		
		driver.quit();
	
	}

}
