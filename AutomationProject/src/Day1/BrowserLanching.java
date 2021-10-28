package Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserLanching
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Practices\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("q")).sendKeys("Good Morning");
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Dimension windowsize =  driver.manage().window().getSize();
		Point windowPos =  driver.manage().window().getPosition();
		
		Point windowPos2 = new Point(4,4);
		driver.manage().window().setPosition(windowPos2);
		
		String pagesoruce = driver.getPageSource();
		
		System.out.println(windowsize);
		System.out.println(windowPos);
		System.out.println(pagesoruce);
		
		driver.close();
		
	
	}
	
}

