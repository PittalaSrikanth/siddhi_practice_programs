package TestNGPractice;

import org.testng.annotations.Test;

public class DependentGroup  extends DepParentClass
{
	@Test(dependsOnMethods = "methodThree")
	public void methodOne()
	{
		System.out.println("Class Two - Method One");
	}
	@Test(dependsOnMethods = {"methodFour","methodFive"})
	public void methodTwo()
	{
		System.out.println("Class Two - Method Two");
	}
	@Test(dependsOnMethods = "methodsix")
	public void methodThree()
	{
		System.out.println("Class Two - Method Three");
	}
	@Test
	public void methodFour()
	{
		System.out.println("Class Two - Method Four");
	}
	@Test
	public void methodFive()
	{
		System.out.println("Class Two - Method Five");
	}
}
