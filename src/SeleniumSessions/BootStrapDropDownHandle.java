package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStrapDropDownHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		WebDriver driver = new FirefoxDriver();	
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		
		System.out.println(list.size());
		
		
		//selecting all drop down options
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			
			//selecting specific drop down option 
			//if (list.get(i).getText().contains("Angular")) {
				list.get(i).click();
			//	break;
			//}
				
		}
		
	}

}
