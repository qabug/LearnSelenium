package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchWithDynamicXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		WebDriver driver = new FirefoxDriver();	
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Covid-19");
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbtc']"));
		
		System.out.println("Total number of suggestions in search box are: "+list.size());
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
		
			if(list.get(i).getText().contains("covid-19 usa")) {
				list.get(i).click();
				break;
			}
		}
	}

}
