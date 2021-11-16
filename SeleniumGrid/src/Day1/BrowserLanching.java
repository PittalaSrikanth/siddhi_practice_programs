package Day1;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class BrowserLanching
{
	
	@Test
	  public void f1() throws MalformedURLException {
		
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-dev-shm-usage");
		  	DesiredCapabilities  ds =DesiredCapabilities.chrome();
		  	ds.setCapability(ChromeOptions.CAPABILITY, options);
		  	options.merge(ds);
		  	ds.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
		  	ds.setCapability(CapabilityType.PLATFORM_NAME,Platform.WINDOWS);
		  	URL url = new URL("http://192.168.0.4:4446/wd/hub");
			WebDriver driver = new RemoteWebDriver(url, ds);
			driver.manage().window().maximize();
			driver.manage().window().fullscreen();
			driver.get("https://www.google.co.in/");
			String title = driver.getTitle();
			System.out.println(title);
			System.out.println("Class 1 Method 1");
			driver.quit();
	  }

	@Test
	  public void f2() throws MalformedURLException {
		
	  	DesiredCapabilities  ds = new DesiredCapabilities();
	  	ds.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
	  	ds.setCapability(CapabilityType.PLATFORM_NAME,Platform.WINDOWS);
	  	URL url = new URL("http://192.168.0.4:4991/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, ds);
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Class 1 Method 2");
		driver.quit();
	  }
	
//	@Test
//	  public void f3() throws MalformedURLException {
//		
//	  	DesiredCapabilities  ds = new DesiredCapabilities();
//	  	ds.setCapability(CapabilityType.BROWSER_NAME, BrowserType.IE);
//	  	ds.setCapability(CapabilityType.PLATFORM_NAME,Platform.WINDOWS);
//	  	URL url = new URL("http://localhost:4999/wd/hub");
//		RemoteWebDriver driver = new RemoteWebDriver(url, ds);
//		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
//		driver.get("https://www.google.co.in/");
//		String title = driver.getTitle();
//		System.out.println("Class 1 Method 3");
//		System.out.println(title);
//		driver.quit();
//	  }

//	@Test
//	  public void f4() throws MalformedURLException {
//		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--no-sandbox");
//		options.addArguments("--disable-dev-shm-usage");
//	  	DesiredCapabilities  ds = new DesiredCapabilities();
//	  	ds.setCapability(ChromeOptions.CAPABILITY, options);
//	  	options.merge(ds);
//	  	ds.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
//	  	ds.setCapability(CapabilityType.PLATFORM_NAME,Platform.WINDOWS);
//	  	URL url = new URL("http://localhost:4444/wd/hub");
//		RemoteWebDriver driver = new RemoteWebDriver(url, ds);
//		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
//		driver.get("https://www.google.co.in/");
//		String title = driver.getTitle();
//		System.out.println(title);
//		System.out.println("Class 1 Method 4");
//		driver.quit();
//	  }
//	
//	@Test
//	  public void f5() throws MalformedURLException {
//		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--no-sandbox");
//		options.addArguments("--disable-dev-shm-usage");
//	  	DesiredCapabilities  ds = new DesiredCapabilities();
//	  	ds.setCapability(ChromeOptions.CAPABILITY, options);
//	  	options.merge(ds);
//	  	ds.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
//	  	ds.setCapability(CapabilityType.PLATFORM_NAME,Platform.WINDOWS);
//	  	URL url = new URL("http://localhost:4444/wd/hub");
//		RemoteWebDriver driver = new RemoteWebDriver(url, ds);
//		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
//		driver.get("https://www.google.co.in/");
//		String title = driver.getTitle();
//		System.out.println(title);
//		System.out.println("Class 1 Method 5");
//		driver.quit();
//	  }
//	
//	@Test
//	  public void f6() throws MalformedURLException {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--no-sandbox");
//		options.addArguments("--disable-dev-shm-usage");
//	  	DesiredCapabilities  ds = new DesiredCapabilities();
//	  	ds.setCapability(ChromeOptions.CAPABILITY, options);
//	  	options.merge(ds);
//	  	ds.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
//	  	ds.setCapability(CapabilityType.PLATFORM_NAME,Platform.WINDOWS);
//	  	URL url = new URL("http://localhost:4444/wd/hub");
//		RemoteWebDriver driver = new RemoteWebDriver(url, ds);
//		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
//		driver.get("https://www.google.co.in/");
//		String title = driver.getTitle();
//		System.out.println(title);
//		System.out.println("Class 1 Method 6");
//		driver.quit();	  }
//	
}

