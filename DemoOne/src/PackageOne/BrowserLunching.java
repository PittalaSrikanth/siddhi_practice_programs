package PackageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class BrowserLunching {

	public static void main(String[] args) throws InterruptedException
	{
			
		// Chrome brower
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.google.co.in/");
		System.out.println(chrome.getTitle());
		chrome.close();
		chrome.quit();
		
		// FirefoxDriver
		System.setProperty("webdriver.gecko.driver","D:\\Selenium_Practices\\chromedriver\\geckodriver.exe");
		WebDriver ff = new FirefoxDriver();
		ff.get("https://www.google.co.in/");
		System.out.println(ff.getTitle());
		ff.close();
		ff.quit();
		
		// IEDriver
		System.setProperty("webdriver.ie.driver","D:\\Selenium_Practices\\chromedriver\\iedriver.exe");
		WebDriver ie = new InternetExplorerDriver();
		ie.get("https://www.google.co.in/");
		System.out.println(ie.getTitle());
		ie.close();
		ie.quit();
		
		// EdgeDriver
		System.setProperty("webdriver.edge.driver","D:\\Selenium_Practices\\chromedriver\\msedgedriver.exe");
		WebDriver edge = new EdgeDriver();
		edge.get("https://www.google.co.in/");
		System.out.println(edge.getTitle());
		edge.close();
		edge.quit();
		
		// OperaDriver
		System.setProperty("webdriver.opera.driver","D:\\Selenium_Practices\\chromedriver\\operadriver.exe");
		WebDriver opera = new OperaDriver();
		opera.get("https://www.google.co.in/");
		System.out.println(opera.getTitle());
		opera.close();
		opera.quit();
		
		// PhantomjsDriver
		System.setProperty("phantomjs.binary.path","D:\\Selenium_Practices\\chromedriver\\phantomjs.exe");
		WebDriver pjs = new PhantomJSDriver();
		pjs.get("https://www.google.co.in/");
		System.out.println(pjs.getTitle());
		pjs.close();
		pjs.quit();
		
		
	}

}
