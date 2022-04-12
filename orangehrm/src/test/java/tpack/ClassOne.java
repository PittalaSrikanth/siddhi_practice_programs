package tpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassOne
{	
	@Test
	public static void add() 
	{
		System.out.println("Hellow Maven");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\spittala\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.quit();
		
	}
	
	
	
}
