package PackageOne;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HtmlUnitDriverBrowsers {

	public static void main(String[] args) throws IOException
	{
		// HtmlUnitDriver
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.co.in/");
		driver.close();
		driver.quit();
		
		// HtmlUnitDriver
		HtmlUnitDriver chrome = new HtmlUnitDriver(BrowserVersion.CHROME);
		chrome.get("https://www.google.co.in/");
		chrome.close();
		chrome.quit();
		
		// HtmlUnitDriver
		HtmlUnitDriver ff = new HtmlUnitDriver(BrowserVersion.FIREFOX_52);
		ff.get("https://www.google.co.in/");
		ff.close();
		ff.quit();
		
		// HtmlUnitDriver
		HtmlUnitDriver ie = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER);
		ie.get("https://www.google.co.in/");
		ie.close();
		ie.quit();

	}

}
