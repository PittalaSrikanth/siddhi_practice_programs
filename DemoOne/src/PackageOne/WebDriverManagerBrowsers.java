package PackageOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerBrowsers {

	public static void main(String[] args) throws InterruptedException
	{

//		WebDriverManager.chromedriver().version("94.0.4606.71").setup();
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager.iedriver().setup();
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		
		driver.close();
		driver.quit();
		
		

		
	}

}
