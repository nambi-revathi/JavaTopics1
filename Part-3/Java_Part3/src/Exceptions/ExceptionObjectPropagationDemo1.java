package Exceptions;

public class ExceptionObjectPropagationDemo1 
{
	public static void greet(String str)       //caller of welcome()
	{
		System.out.println(str);
		welcome(null);
	}
	public static void welcome(String str)
	{
		if(str.equals("welcome"));              //NullPointerException
		System.out.println(str);
	}

	public static void main(String[] args)      //caller of greet()
	{
		System.out.println("Main starts");
		try
		{
			greet("good morning");
		}
		catch(Exception e)
		{
			System.out.println("Exception handled by main()");
		}
		System.out.println("Main ends");

	}

}
