package TestNGPrac;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import ch.qos.logback.core.util.FileUtil;

public class PageScreenshot extends utils {

	public void capture(String filename) throws IOException 
	{
		TakesScreenshot screen = (TakesScreenshot) driver;
		File pic = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pic,new File("D:\\FailedScriptsScreenshots\\"+filename+".png"));
	}
	 
}
