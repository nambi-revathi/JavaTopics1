package Exceptions;

public class Demo1 {

	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		
		try
		{
			int c=a/b;               //ArithmeticException
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic Exception handled");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointer Exception handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
	}

}
