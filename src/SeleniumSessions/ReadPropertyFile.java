package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertyFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("/Users/cmallikarjunap/eclipse-workspace/LearnSelenium/src/SeleniumSessions/config.properties");
		
		prop.load(ip);
		
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("URL"));
		
		String url = prop.getProperty("URL");
		
		String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
		
		if (browserName.equals("firefox")) {
		
			System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
			driver = new FirefoxDriver();
			
			//driver.manage().window().maximize();//maximize the window
			//driver.manage().deleteAllCookies();//delete all cookies
			
			//Dynamic wait
			//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		else if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/cmallikarjunap/eclipse-workspace/chromedriver");
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();//maximize the window
			driver.manage().deleteAllCookies();//delete all cookies
			
			//Dynamic wait
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		driver.get(url);

		
		WebElement submit = driver.findElement(By.xpath(prop.getProperty("find_xpath")));
				
		submit.sendKeys(prop.getProperty("search"));

		submit.submit();
		
		//Thread.sleep(1000);
		//driver.quit();
	}

}
