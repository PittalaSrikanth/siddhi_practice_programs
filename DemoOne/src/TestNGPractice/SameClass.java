package TestNGPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SameClass
{	
	@Test(dataProvider = "testdata")
	public void MethodOne(String text1) throws InterruptedException
	{
		System.out.println("Class One - Method One");
		System.out.println(text1);
	}
	@DataProvider(name = "testdata")
	public Object[][] data()
	{
		Object[][] obj = new Object[][]{ {"data1"},{"data2"},{"data1"},{"data2"}};
		return obj;
	}
	
	
}
