package PackageOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Select day = new Select(driver.findElement(By.xpath("//select[contains(@name,'Day')]")));
		Boolean ismultipleDay = day.isMultiple();
		System.out.println(ismultipleDay);
		day.selectByVisibleText("30");
		
		day.deselectByIndex(30);
		
		Thread.sleep(5000);
		

		
//		Browser close
		driver.close();
		
//		Browser quit
		driver.quit();
	}


}
