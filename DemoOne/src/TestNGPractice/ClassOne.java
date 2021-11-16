package TestNGPractice;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ClassOne
{	
	@Parameters({"sample1","sample2"})
	@Test
	public void MethodOne(@Optional("optional text")String text1,String text2) throws InterruptedException
	{
		System.out.println("Class One - Method One");
		System.out.println(text1);
		System.out.println(text2);
	}
	public void MethodTwo()
	{
		System.out.println("Class One - Method Two");
	}
	public void MethodThree()
	{
		System.out.println("Class One - Method Three");
	}
	public void MethodFour()
	{
		System.out.println("Class One - Method Four");
	}
	public void MethodFive()
	{
		System.out.println("Class One - Method Five");
	}
}
