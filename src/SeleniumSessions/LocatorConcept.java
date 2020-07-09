package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class LocatorConcept {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Using Firefox
		
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://github.com/");//enter test server URL 
		
		/* using Safari 
		WebDriver sdriver = new SafariDriver();
		
		sdriver.get("https://github.com/");
		*/
		
		//Using XPATH, unless it has heirarchy Only relative XPATH should be used
		
		//driver.findElement(By.xpath("//*[@id=\"user[login]\"]")).sendKeys("Shameen");
		
		//driver.findElement(By.xpath("//*[@id=\"user[email]\"]")).sendKeys("Shaw");
		
		//driver.findElement(By.xpath("//*[@id=\"user[password]\"]")).sendKeys("Shaw@ebay.com");
		//driver.quit();
		
		
		/* Using ID: first priority
		
		sdriver.findElement(By.id("user[login]")).sendKeys("Shameen");
		sdriver.findElement(By.id("user[email]")).sendKeys("Shaw");
		sdriver.findElement(By.id("user[password]")).sendKeys("Shaw@ebay.com");
		*/
		
		/* //using name: priority3
		sdriver.findElement(By.name("user[login]")).sendKeys("Shameen");
		sdriver.findElement(By.name("user[email]")).sendKeys("Shaw");
		sdriver.findElement(By.name("user[password]")).sendKeys("Shaw@ebay.com");
		
		*/
		/* using Linktext : priority over partialtest
		
		driver.findElement(By.linkText("Sign up")).click();
		
		*/
		
		//using partialLinkText: Not recommended
		
		//driver.findElement(By.partialLinkText("Learn")).click();
		
		//using CSS selector: can be used 
		
		driver.findElement(By.cssSelector("#user\\[login\\]")).sendKeys("qabug");
		
		//using Class name: Not Recommended as different elements can have same class name
		
		driver.findElement(By.className("form-control form-control-lg input-block")).sendKeys("qabug");
		
	}

}
