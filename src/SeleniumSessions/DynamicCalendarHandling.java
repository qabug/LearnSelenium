package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicCalendarHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		WebDriver driver = new FirefoxDriver();	
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://freecrm.com/");
		
		driver.findElement(By.cssSelector("a.btn:nth-child(10)")).click();

		driver.findElement(By.name("email")).sendKeys("qabug2020@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Qabug@123");	
		
		driver.findElement(By.cssSelector("div[class='ui fluid large blue submit button']")).click();//login
		
		driver.findElement(By.cssSelector("#main-nav > a:nth-child(2) > span:nth-child(2)")).click();//select Calendar
		
		driver.navigate().refresh();
		
		String date="23-June-2020";
		
		String dateArray[]=date.split("-");//contains 23,June, 2020
		
		String day=dateArray[0];
		String month=dateArray[1];
		String year=dateArray[2];
		
		Select slctMonth= new Select(driver.findElement(By.name("slctMonth")));
		slctMonth.selectByVisibleText(month);
		
		Select slctYear= new Select(driver.findElement(By.name("slctyear")));
		slctYear.selectByVisibleText(year);
		
	}

}
