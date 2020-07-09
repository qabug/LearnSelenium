package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		
		String s= a.getText();
		
		if(s.equals("Please enter a valid user name")) {
			System.out.println("Valid Alert message");
			
		}
		else {
			System.out.println("InValid Alert message");
		}
		a.accept();
		
	}

}
