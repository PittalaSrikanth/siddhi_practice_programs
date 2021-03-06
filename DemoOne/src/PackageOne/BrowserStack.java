package PackageOne;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserStack {
	public WebDriver driver;
	public static final String USERNAME = "srikanthp_fl3dq0";
	public static final String AUTOMATE_KEY = "TShy65VzEAHoBFUsyr4Y";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
	
	@Test
	public void openSTM() throws Exception {
                // To execute scripts through remote server or grid on mulitple browsers, we need to set capabilities of platform, version etc., to run the scripts
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setPlatform(Platform.WINDOWS);
		capability.setBrowserName("chrome");
		capability.setVersion("99");
		capability.setCapability("browserstack.debug", "true");
		// Creatng URL object
		URL browserStackUrl = new URL(URL);
		// Create object of driver. We execute scripts remotely. So we use RemoteWebDriver
		//There are many constructors to remotewebdriver
                //To pass URL object and Capabilities object, use the below mentioned constructor
                //RemoteWebDriver(URL remoteAddress, Capabilities desiredCapabilities)
		driver = new RemoteWebDriver (browserStackUrl, capability);
		//Implicit wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to open url
		driver.get("https://www.softwaretestingmaterial.com");
		// To get the current url
		String actualURL = driver.getCurrentUrl();
		// To print the URL
		System.out.println("URL is "+actualURL);
		driver.quit();
		String expectedURL = "https://www.softwaretestingmaterial.com/";
                //Assert to verify the actual and expected values
		Assert.assertEquals(actualURL, expectedURL,"Expected and Actual are not same");		
	}
}