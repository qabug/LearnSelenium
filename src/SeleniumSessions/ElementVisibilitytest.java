package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementVisibilitytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		WebDriver driver = new FirefoxDriver();	
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://register.freecrm.com/register/");	
		
		//1. isDisplayed() method: applicable for all elements
		boolean b1=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/form/div[6]/button")).isDisplayed();
		
		System.out.println(b1);
		
		//2.isEnabled() method. applicable only if button is active
		boolean b2=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/form/div[6]/button")).isEnabled();
		
		System.out.println(b2);
		
		
		//isSelected is used for radio buttons or Checkbox or drop down buttons
		boolean b3=driver.findElement(By.id("terms")).isSelected();
		System.out.println(b3);
		driver.findElement(By.id("terms")).click();
		boolean b4=driver.findElement(By.id("terms")).isSelected();
		System.out.println(b4);
		driver.findElement(By.id("terms")).click();
		boolean b5=driver.findElement(By.id("terms")).isSelected();
		System.out.println(b5);
	
	
	}
	
	

}
