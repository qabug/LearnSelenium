package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HTMLUnitDriverConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		//WebDriver driver = new FirefoxDriver();
		//Benefits of HtmlUnitDriver
		//1. Super fast. increase in automation script performance 
		//2. Enables us to run the scripts on system which doesn't have a browser
		//3. Supports browser versions
		//4. HtmlUnitDriver is a separate entity from selenium 3.0+
		//5.Not suitable for for actions class- ex: user actions, mouse movement, double click, drag and drop
		//Also called Ghost Driver or Headless Browser. few of them are
			//Phantom JS -- JS
			//HtmlUnitDriver --Java
		
		WebDriver driver=  new HtmlUnitDriver();
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://ui.freecrm.com/");
		
		System.out.println("before login title is: "+driver.getTitle());
		
		driver.findElement(By.name("email")).sendKeys("qabug2020@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Qabug@123");
		
		
		driver.findElement(By.cssSelector("div[class='ui fluid large blue submit button']")).click();
		
		System.out.println("After login title is: "+driver.getTitle());
	
		
		
		
	}

}
