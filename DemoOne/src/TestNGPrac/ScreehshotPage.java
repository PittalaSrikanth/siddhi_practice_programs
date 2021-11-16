package TestNGPrac;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class ScreehshotPage extends ClassFive{

	public static void screenshot(String filename) throws IOException 
	{
		TakesScreenshot screen = (TakesScreenshot) driver;
		File scrn = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrn, new File("D:\\TestNGDemo123\\"+filename+".png"));
	}

	
	
	
}
