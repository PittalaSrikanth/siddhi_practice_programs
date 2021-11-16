package TestNGPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners({ListnerTest.class})
public class ClassOne3 extends utils
{	
	@BeforeMethod
	public void classOnemethodOne() 
	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("start-maximized");
		WebDriverManager.chromedriver().version("95.0.4638.69").setup();
		driver = new ChromeDriver(ops);
	}
	@Test()
	public void classOnemethodTwo() 
	{
		driver.get("https://www.google.co.in/");
		Assert.assertEquals(driver.getTitle(), "Google", "Dashboard title not matched");
		Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
		Assert.assertNotNull(driver.findElements(By.name("q")).size());
		Assert.assertThrows(NoSuchElementException.class,() ->driver.findElement(By.name("q")).sendKeys("Hai"));
	}
	@Test
	public void classOnemethodFour() 
	{
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Siddhi");
	}

	@AfterMethod
	public void classOnemethodThree() 
	{
		driver.quit();
	}	
}
