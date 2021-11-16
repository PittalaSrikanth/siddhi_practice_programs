package TestNGPractice;

import org.testng.annotations.Test;


public class DifferentClass
{	
//	@Test(dataProvider = "testdata",dataProviderClass = DifferentData.class)
//	public void MethodOne(String text1,String text2) throws InterruptedException
//	{
//		System.out.println("Class One - Method One");
//		System.out.println(text1);
//		System.out.println(text2);
//
//	}
	
	@Test(dataProvider = "testdata",dataProviderClass = DifferentData.class)
	public void MethodOne(String text1,String text2,String text3) throws InterruptedException
	{
		System.out.println("Class One - Method One");
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);

	}
	
	
	
}
