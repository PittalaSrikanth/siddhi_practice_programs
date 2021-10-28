package PackageOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerBrowsers {

	public static void main(String[] args) throws InterruptedException
	{

		// ChromeDriver
		WebDriverManager.chromedriver().setup();
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.google.co.in/");
		System.out.println(chrome.getTitle());
		chrome.close();
		chrome.quit();
		
		// FirefoxDriver
		WebDriverManager.firefoxdriver().setup();
		WebDriver ff = new FirefoxDriver();
		ff.get("https://www.google.co.in/");
		System.out.println(ff.getTitle());
		ff.close();
		ff.quit();

		
		// IEDriver
		WebDriverManager.iedriver().setup();
		WebDriver ie = new InternetExplorerDriver();
		ie.get("https://www.google.co.in/");
		System.out.println(ie.getTitle());
		ie.close();
		ie.quit();

		
		// EdgeDriver
		WebDriverManager.edgedriver().setup();
		WebDriver edge = new InternetExplorerDriver();
		edge.get("https://www.google.co.in/");
		System.out.println(edge.getTitle());
		edge.close();
		edge.quit();

		
	}

}
