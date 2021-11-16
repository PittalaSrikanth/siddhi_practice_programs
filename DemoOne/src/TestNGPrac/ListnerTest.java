package TestNGPrac;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerTest  implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() +" - Test started execution");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() +" - Test Passed");

	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println(result.getName() +" - Test Failed");
		PageScreenshot pss = new PageScreenshot();
		try {
			pss.capture(result.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	
}
