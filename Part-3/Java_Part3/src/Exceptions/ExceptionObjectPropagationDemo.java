package Exceptions;

public class ExceptionObjectPropagationDemo 
{
	public static void m1() //called method
	{
		int a=10;
		int b=0;
		int c=a/b;
	}

	public static void main(String[] args)  //calling method
	{
		try
		{
			m1();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled by calling method");
		}
		

	}

}
