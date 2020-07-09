package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/cmallikarjunap/Downloads/Selenium-Java/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		
		//Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.get("https://freecrm.com/");
		System.out.println("before login title is: "+driver.getTitle());
		
		//driver.findElement(By.name("email")).sendKeys("qabug2020@gmail.com");
		
		//driver.findElement(By.name("password")).sendKeys("Qabug@123");
		
		
		//driver.findElement(By.cssSelector("div[class='ui fluid large blue submit button']")).click();
		
		System.out.println("After login title is: "+driver.getTitle());
		//WebElement loginbtn=driver.findElement(By.cssSelector("div[class='ui fluid large blue submit button']"));
		
		//flash(loginbtn, driver);
	
		//Highlighting and taking screenshots
		//drawBorder(loginbtn, driver);

	//	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		
		//FileHandler.copy(src, new File ("/Users/cmallikarjunap/eclipse-workspace/LearnSelenium/Screenshots/login1.png"));
		//generating Alerts in js
		
		//generateAlert(driver," This is a test for alerts" );
		
		//click on any elements using Java Script executor
		//clickElementsByJS(loginbtn,driver);
		
		//refreshing the browser by using selenium
		
		//driver.navigate().refresh();
		
		//refreshBrowserByJS(driver);
		
		System.out.println(getTitleByJS(driver));
		
		System.out.println(getPageInnerTexteByJS(driver));
		scrollPageDown(driver);
		//Thread.sleep(2000);
		//scrollPageUp(driver);
		
		//WebElement crm = driver.findElement(By.xpath("//a[contains(text(),'CRM for Any Busniess')]"));
		
		
		//scrollIntoView(crm, driver);

	}
	
	
	public static void flash(WebElement element, WebDriver driver) {
	//	JavascriptExecutor js =((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i=0;i<10;i++) {
			changeColor("rgb(255,0,0)", element,driver);
			changeColor(bgcolor,element,driver);
			
		}
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		try {
			Thread.sleep(20);
		}catch(InterruptedException e) {
		}
		
	}	
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
		
	}
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
		
	}
	
	public static void clickElementsByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", element);
		
	}
	
	public static void refreshBrowserByJS (WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
		
	}
	public static String getTitleByJS (WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		String str = js.executeScript("return(document.title);").toString();
		return str;
		
	}
	
	public static String getPageInnerTexteByJS (WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		String str1 = js.executeScript("return document.documentElement.innerText;").toString();
		return str1;
		
	}	
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}	
	
	public static void scrollPageUp(WebDriver driver) {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
	}	
	
	public static void scrollIntoView(WebElement  element, WebDriver driver) throws InterruptedException {
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}	
	
}
