package PackageOne;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerGrid {
	public static void main(String[] args) throws MalformedURLException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--no-sandbox");
	options.addArguments("--disable-dev-shm-usage");
  	DesiredCapabilities  ds =new DesiredCapabilities();
  	ds.setCapability(ChromeOptions.CAPABILITY, options);
  	options.merge(ds);
  	ds.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
  	ds.setCapability(CapabilityType.PLATFORM_NAME,Platform.LINUX);
  	URL url = new URL("http://localhost:4545/wd/hub");
	WebDriver driver = new RemoteWebDriver(url, ds);
	driver.manage().window().maximize();
	driver.manage().window().fullscreen();
	driver.get("https://www.google.co.in/");
	String title = driver.getTitle();
	System.out.println(title);
	System.out.println("Class 1 Method 1");
	driver.quit();
	}
}