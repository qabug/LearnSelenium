package SeleniumSessions;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectCalendarByJS {
	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		WebDriver driver = new FirefoxDriver();	
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.hotwire.com/flights/");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the date(mm/dd/yyyy): ");
		String dateVal= sc.next();
		
		
		 //using selenium scripts
		driver.findElement(By.xpath("//*[@id=\"farefinder-flight-startdate-input\"]")).sendKeys(dateVal);   
		
		/*Using java script: Not always recommended as this will accept wrong date as well
		 * WebElement date = driver.findElement(By.xpath("//*[@id=\"farefinder-flight-startdate-input\"]"));
		 *

		String dateVal = "06/28/2020";
		
	
		selectDateByJS(date,dateVal,driver);
		
		*/
		
	}
	
	
	public static void selectDateByJS(WebElement element, String dateVal, WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);	
		
	}
	

}
