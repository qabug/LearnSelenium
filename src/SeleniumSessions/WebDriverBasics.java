package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Firefox browser
		//geckodriver class used for launching ff
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		//Launching Chrome Browser
		
		//System.setProperty("webdriver.chrome.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/chromedriver");
		
		//WebDriver cdriver = new ChromeDriver();
		
		//cdriver.get("http://google.com");
		
		String title = driver.getTitle(); 
		
		System.out.println(title);
		
		if (title.equals("Google")) {
			System.out.println("Correct Title");
		}
		else {
			System.out.println("InCorrect Title");
		}
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		driver.quit();
	
	}

}
