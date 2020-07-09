package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);//applicable only if frame is present 
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
		.release()
		.build()
		.perform();
	
		
		
	}

}
