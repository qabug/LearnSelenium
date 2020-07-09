package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingFileUploadPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("/Users/cmallikarjunap/Desktop/test.html");

	}

}
