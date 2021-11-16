package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestLisnersClass.class})
public class LisClass
{	
	@Test
	public void MethodOne() throws InterruptedException
	{
		Assert.assertNotNull(null);
	}
	@Test
	public void MethodTwo()
	{
		System.out.println("Class One - Method Two");
	}
	@Test
	public void MethodThree()
	{
		System.out.println("Class One - Method Three");
	}
	@Test
	public void MethodFour()
	{
		System.out.println("Class One - Method Four");
	}
	@Test
	public void MethodFive()
	{
		System.out.println("Class One - Method Five");
	}
}
