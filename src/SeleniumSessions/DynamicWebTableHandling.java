package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTableHandling {

	public static void main(String[] args) throws InterruptedException {
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
		
		driver.findElement(By.cssSelector("div[class='ui fluid large blue submit button']")).click();
		
		driver.findElement(By.cssSelector("#main-nav > a:nth-child(3) > span:nth-child(2)")).click();
		
		driver.navigate().refresh();
		
		//Method1: using for loop
		
		/*String before_xpath="/html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		String after_xpath="]/td[2]";
		
		for (int i=1; i<=3;i++) {
			
			String name=driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			System.out.println(name);
			if(name.contains("test2 Selenium")) {
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[1]")).click();
			}
		}
		*/
		
		//Method#2: USing Customized xpath
		//driver.findElement(By.xpath("a[contains(text(),'Test1 selenium')]//parent::td[@class='<classname>'//preceding-sibling::td[@class='<classname of sibling>']//input[@name='id']")).click();
		
	}
	
}
