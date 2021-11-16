package PackageOne;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemoOne123 {

	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("firefox");
		ds.setPlatform(Platform.WINDOWS);
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.186:4999/wd/hub"),ds);
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());

	}

}
