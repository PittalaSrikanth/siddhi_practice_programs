package PackageOne;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowsersluanching {

	public static void main(String[] args) throws IOException
	{
		// ChromeDriver
		ChromeOptions cops = new ChromeOptions();
//		cops.addArguments("--headless");
		cops.setHeadless(true);
		
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.chromedriver().version("94.0.4606.71").setup();
		WebDriver chrome = new ChromeDriver(cops);
		chrome.get("https://www.google.co.in/");
		System.out.println(chrome.getTitle());
		chrome.close();
		chrome.quit();
		
		// FirefoxDriver
		FirefoxOptions fops = new FirefoxOptions();
		fops.addArguments("--headless");
//		fops.setHeadless(true);
		WebDriverManager.firefoxdriver().setup();
		WebDriver ff = new FirefoxDriver(fops);
		ff.get("https://www.google.co.in/");
		System.out.println(ff.getTitle());
		ff.close();
		ff.quit();
		
		
	}

}
