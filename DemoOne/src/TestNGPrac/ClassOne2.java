package TestNGPrac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ClassOne2
{	
	@Test()
	public void classOnemethodThree() 
	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("start-maximized");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Siddhi");
		driver.quit();
	}
	@Test
	public void classOnemethodFour() 
	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("start-maximized");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Siddhi");
		driver.quit();
	}
	@Test
	public void classOnemethodFive() 
	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("start-maximized");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Siddhi");
		driver.quit();
	}
	@Test
	public void classOnemethodSix() 
	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("start-maximized");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Siddhi");
		driver.quit();
	}
	@Test
	public void classOnemethodSeven() 
	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("start-maximized");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Siddhi");
		driver.quit();
	}
	@Test
	public void classOnemethodEight() 
	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("start-maximized");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Siddhi");
		driver.quit();
	}
	@Test
	public void classOnemethodNine() 
	{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("start-maximized");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Siddhi");
		driver.quit();
	}
	
	
}
