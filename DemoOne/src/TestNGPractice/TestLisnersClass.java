package TestNGPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestLisnersClass implements ITestListener
{	
	@Override
	public void onFinish(ITestContext context) {
		
	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().toString());
		System.out.println("Test Failed");
	}
	
}
