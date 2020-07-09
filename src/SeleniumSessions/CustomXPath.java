package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.get("https://github.com/");
		
		//xpath by class
		
		//driver.findElement(By.xpath("//input[@class='form-control input-sm header-search-input jump-to-field js-jump-to-field js-site-search-focus ']")).sendKeys("Test");
				
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("test"); //path by name/id
		
		
		//starts-with and ends-with
		//driver.findElement(By.xpath("//input[ends-with(@class,'js-site-search-focus')]")).sendKeys("test");
		
		//for links
		
		//driver.findElement(By.xpath("//a[contains(text(),'Team')]")).click();
		
		driver.findElement(By.linkText("Team")).click();
		

	}

}
