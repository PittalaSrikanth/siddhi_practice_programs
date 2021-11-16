package tpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassOne
{	
	@Test
	public static void add() 
	{
		System.out.println("Hellow Maven");
		WebDriver driver = new FirefoxDriver();
		driver.get("");
		
	}
	
	
	
}
