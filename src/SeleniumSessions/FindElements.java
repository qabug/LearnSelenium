package SeleniumSessions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {

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
		
		
		//1. get the count of links on the page
		//2. get the text of each links on the page
		
		//list the size
		List <WebElement> ll = driver.findElements(By.tagName("a"));
		
		
		System.out.println(ll.size());
		
		List <WebElement> ll1 = driver.findElements(By.tagName("input"));
		System.out.println(ll1.size());
		
		//list the text
		for(int i=0; i<ll.size(); i++){
			String text = ll.get(i).getText();
			System.out.println(text);
		}
		
		driver.quit();
		
		
		
		
		
	}

}
