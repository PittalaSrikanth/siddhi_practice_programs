package PackageOne;

import java.net.MalformedURLException;
import java.net.URL;
	
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridDemo {

	public static void main(String[] args) throws MalformedURLException   
	{
		DesiredCapabilities ds =DesiredCapabilities.chrome();
		ds.setBrowserName("chrome");
		ds.setPlatform(Platform.WINDOWS);
//		System.setProperty("webdriver.gecko.driver","D:\\Selenium_Practices\\chromedriver\\geckodriver.exe");
		WebDriver rc = new RemoteWebDriver(new URL("http://192.168.0.4:4999/wd/hub"), ds);
		rc.get("https://www.google.co.in");
		System.out.println(rc.getTitle());
		rc.quit();
	}

}
