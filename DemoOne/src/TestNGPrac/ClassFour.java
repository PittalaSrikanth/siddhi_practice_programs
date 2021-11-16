package TestNGPrac;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassFour
{
	@Parameters({"TestData1","TestData2"})
	@Test()
	public void classFourmethodOne(@Optional(value = "Siddhi2")String FirstName,String LastName) 
	{
		System.out.println(FirstName+" : "+LastName);
	}
	
	@Parameters({"TestData3"})
	@Test
	public void classFourmethodTwo(String FirstName) 
	{
		System.out.println(FirstName);
	}
	
//	public void classFourmethodThree() 
//	{
//		System.out.println("ClassFour - method Three");
//	}
//	public void classFourmethodFour() 
//	{
//		System.out.println("ClassFour - method Four");
//	}
//	public void classFourmethodFive() 
//	{
//		System.out.println("ClassFour - method Five");
//	}
}
