package Exceptions;

public class ThrowsDemo 
{
	public static void m1() throws ArrayIndexOutOfBoundsException
	{
	int a[]=new int[5];
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);
	System.out.println(a[5]);
	}

	public static void main(String[] args)  //caller
	{
		try
		{
			m1();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled by caller");
		}
		
	}

}
