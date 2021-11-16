package TestNGPractice;

import org.testng.annotations.DataProvider;


public class DifferentData
{	
//	@DataProvider(name = "testdata")
//	public Object[][] data()
//	{
//		Object[][] obj = new Object[][]{ {"data1","data2"},{"data3","data4"}};
//		return obj;
//	}
	@DataProvider(name = "testdata")
	public Object[][] data()
	{
		Object[][] obj = new Object[2][3];
		obj[0][0] = "Text1";
		obj[0][1] = "Text2";
		obj[0][2] = "Text3";
		
		obj[1][0] = "Text4";
		obj[1][1] = "Text5";
		obj[1][2] = "Text6";
		return obj;
	}
	
	
}
