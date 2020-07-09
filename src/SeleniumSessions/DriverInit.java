package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInit {

	private static DriverInit instanceDriver = null;

	private WebDriver Driver;
	
	//private DriverInit() {
		
	//}
	
	public WebDriver openBrowser() {
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		WebDriver driver = new FirefoxDriver();
		return (driver);
	}
	
	public static DriverInit getInstance() {
		if(instanceDriver == null)
			instanceDriver =  new DriverInit();
		return instanceDriver;
		}
		
}
	
