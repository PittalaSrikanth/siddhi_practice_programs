package PackageOne;
public class Cbr 
{
	int value;
	
	public static void main(String args[]) 
	{
		int x = 5;
		Cbr cb = new Cbr();
		cb.value = 8;
		
		callbyvalue(x);
		System.out.println(x);
		
		callbyref(cb);
		System.out.println(cb.value);
	}
	
	public static void callbyvalue(int x) 
	{
		x = 10;
	}
	
	public static void callbyref(Cbr cbr) 
	{
		cbr.value = 15;
	}
}
