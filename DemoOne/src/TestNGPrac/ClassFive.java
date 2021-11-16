package TestNGPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners({Lstn.class})
public class ClassFive extends DriverInst
{
	
	@Parameters({"browser"})
	@BeforeTest
	public void BrowserLaunching(String browser) 
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	}
	@Test
	public void login(String UserName,String Password) 
	{		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).submit();
		Assert.assertTrue(driver.findElement(By.xpath("//b[text()='Dashboard']")).isDisplayed());
	}
	
	@Parameters({"adduser"})
	@Test(dependsOnMethods = "login")
	public void addUser(String username) throws InterruptedException 
	{
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		driver.findElement(By.name("btnAdd")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Add User']")).isDisplayed());
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(" ");
		driver.findElement(By.xpath("//li[text()='Anthony']")).click();
		driver.findElement(By.id("systemUser_userName")).sendKeys(username);
		driver.findElement(By.id("systemUser_password")).sendKeys("Siddhi@123");
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Siddhi@123");
		Thread.sleep(5000);
		driver.findElement(By.name("btnSave")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='System Users']")).isDisplayed());

	}
	
}
