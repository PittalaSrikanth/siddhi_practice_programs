package TestNGPractice;

import org.testng.annotations.Test;

public class ClassTwo 
{
	@Test(groups = "smoke")
	public void MethodOne()
	{
		System.out.println("Class Two - Method One");
	}
	@Test(groups = "regression")
	public void MethodTwo()
	{
		System.out.println("Class Two - Method Two");
	}
	@Test(groups = { "smoke","regression"})
	public void MethodThree()
	{
		System.out.println("Class Two - Method Three");
	}
	public void MethodFour()
	{
		System.out.println("Class Two - Method Four");
	}
	public void MethodFive()
	{
		System.out.println("Class Two - Method Five");
	}
}
