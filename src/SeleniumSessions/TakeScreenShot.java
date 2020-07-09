package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		WebDriver driver = new FirefoxDriver();	
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://www.google.com/");	
		
		
		//Take Screenshots and save in file format
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//FileUtils.copyFile(src, new File ("/Users/cmallikarjunap/eclipse-workspace/LearnSelenium/Screenshots/google.png"));
		
		
		FileHandler.copy(src, new File ("/Users/cmallikarjunap/eclipse-workspace/LearnSelenium/Screenshots/google1.png"));
		

		
	}

}
