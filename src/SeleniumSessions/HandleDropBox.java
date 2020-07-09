package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args){
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://www.roboform.com/filling-test-all-fields");
		
		driver.get("https://online.roboform.com/login?lang=");
		
		//Handling drop down
		
		Select select = new Select(driver.findElement(By.name("40cc__type")));
		select.selectByVisibleText("Discover");
		
		
		//Checkbox
		
		driver.findElement(By.name("safe_device")).click();
		
	}

}