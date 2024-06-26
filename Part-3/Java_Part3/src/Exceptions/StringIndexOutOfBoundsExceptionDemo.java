package Exceptions;

public class StringIndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) 
	{
		String s1="Revathi";
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(4));
		System.out.println(s1.charAt(5));
		System.out.println(s1.charAt(6));
		
		try 
		{
			System.out.println("good morning");
			System.out.println("hiiiii");
			System.out.println(s1.charAt(7));                //StringIndexOutOfBoundsException
			System.out.println("byeeeee");
			System.out.println("end");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Index out of Bounds");
		}
	}

}
