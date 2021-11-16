package TestNGPractice;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
@Test
public class ClassThree
{
	@Test(expectedExceptions = {NoSuchElementException.class,ElementNotFoundException.class})
	public void MethodOne()
	{
		System.out.println("Class Three - Method One");
	}
	public void MethodTwo()
	{
		System.out.println("Class Three - Method Two");
	}
	public void MethodThree()
	{
		System.out.println("Class Three - Method Three");
	}
	
	
	public void MethodFour()
	{
		System.out.println("Class Three - Method Four");
	}
	public void MethodFive()
	{
		System.out.println("Class Three - Method Five");
	}
}
