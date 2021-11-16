package PackageOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleDemo3 {
	@Test
	public  void testngtest()
	{
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("start-maximized");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(ops);
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("Siddhi");
		driver.findElement(By.className("XDyW0e"));
		driver.navigate().forward();
		
		
		driver.findElement(By.linkText("Gmail")).click();
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Ima")).click();
		
		driver.navigate().back();
		
		driver.findElements(By.className("gb_f")).get(0).click();
		
		driver.navigate().back();
		
		driver.findElements(By.className("gb_f")).get(1).click();
		
		driver.navigate().back();
		
		
		driver.findElement(By.xpath("//a[@data-toggle='pill']")).click();
		
		
		driver.quit();
		

		
	}

}
