package TestNGPrac;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassTwo 
{
//	@DataProvider(name = "testdata")
//	public Object[][] testdatmethod() 
//	{
//		Object[][] obj = new Object[][] {{"siddhiuser1","siddhipassword1"},{"siddhiuser2","siddhipassword2"}};
//		return obj;
//		
//	}
	@Test()
	public void classTwomethodOne() 
	{
		System.out.println("ClassTwo - method One");
	}
	public void classTwomethodTwo() 
	{
		System.out.println("ClassTwo - method Two");
	}
	public void classTwomethodThree() 
	{
		System.out.println("ClassTwo - method Three");
	}
	public void classTwomethodFour() 
	{
		System.out.println("ClassTwo - method Four");
	}
	public void classTwomethodFive() 
	{
		System.out.println("ClassTwo - method Five");
	}
}
