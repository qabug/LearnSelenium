package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
public class SafariTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new SafariDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		
		driver.quit();
		
		
		
	}

	
}
