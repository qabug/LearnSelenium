package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/**different types of pop ups
		1. Alerts( accept and dismiss method can be used)
		2. File upload pop ups( Browse button with type- file use sendKeys(path)
		3. Browser window / pop-ups--getWindowHandles
		*/
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		
		Thread.sleep(2000);
		
		//Set doesnt store the value based on indexes
		
		Set <String> handler = driver.getWindowHandles();
		
		Iterator<String> itr= handler.iterator();
		
		String parentW=itr.next();
		
		System.out.println("Parent WIndow ID: " +parentW);
		
		String childW=itr.next();
		
		System.out.println("Child Window ID: " +childW);
		
		driver.switchTo().window(childW);
		Thread.sleep(2000);
		
		System.out.println("Child Popup Window title: " +driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentW);
		
		Thread.sleep(2000);
		
		System.out.println("Parent Window title: " +driver.getTitle());
		driver.quit();
		
		
	}

}
