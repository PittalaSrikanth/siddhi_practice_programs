package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLanch
{
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.google.co.in/");
		
	
		System.setProperty("webdriver.gecko.driver","D:\\Selenium_Practices\\chromedriver\\geckodriver.exe");
		WebDriver firefox = new FirefoxDriver();
		
		
		
	
	}
	
}

