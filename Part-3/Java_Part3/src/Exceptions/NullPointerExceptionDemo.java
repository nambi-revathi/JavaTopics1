package Exceptions;

public class NullPointerExceptionDemo {

	public static void main(String[] args) 
	{
		String name="Revathi";
		String s=null;
		
		try 
		{
		     System.out.println(s.equals(name));          //NullPointerException
		}
		catch(NullPointerException e)
		{
			System.out.println("Cannot compare with null");
		}
		System.out.println(name);
		System.out.println(s);
		
	}

}
