package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BrokenLinkTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
			System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
			WebDriver driver = new FirefoxDriver();	
		
			driver.manage().window().maximize();//maximize the window
			driver.manage().deleteAllCookies();//delete all cookies
			

			//Dynamic wait
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			//driver.get("https://freecrm.com/");
			
			driver.get("https://www.reddit.com/");
			
			System.out.println("Login page title: " +driver.getTitle());
			
			/*driver.findElement(By.cssSelector("a.btn:nth-child(10)")).click();

			driver.findElement(By.name("email")).sendKeys("qabug2020@gmail.com");
			
			driver.findElement(By.name("password")).sendKeys("Qabug@123");
			driver.findElement(By.cssSelector("div[class='ui fluid large blue submit button']")).click();
			
			*/

			//links are associated with 'a' and images are associated with "img" tags
			
			//1. get the list of all the links and images
			
		
			List<WebElement> ll= driver.findElements(By.tagName("a"));
			ll.addAll(driver.findElements(By.tagName("img")));
			
			List<WebElement> activelinks= new ArrayList<WebElement>();
			
			
			System.out.println("Size of complete list of links and images are:-----> "+ll.size());
			
			//2.Iterate Linklist to exclude all the links/images-doesn't have any href attribute
			for (int i=0;i<ll.size();i++) {
				
				//new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("a")));
				//System.out.println(ll.get(i).getAttribute("href"));
				
				if (ll.get(i).getAttribute("href") != null && (!ll.get(i).getAttribute("href").contains("javascript"))) {
					activelinks.add(ll.get(i));
				}
			}
			System.out.println("Size of active links and images are: ---->"+activelinks.size());
			
			//3. Check the href URL with httpconnection API
			
			for(int j=0;j<activelinks.size();j++){
				
				HttpURLConnection connection = (HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
				connection.connect();
				String response = connection.getResponseMessage();
				connection.disconnect();

				System.out.println(activelinks.get(j).getAttribute("href")+"--->"+response);
			}
	}

}
