package PackageOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HtmlUnitBrowsers {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
		
		driver.get("https://www.google.co.in");
		
		

		
	}

}
