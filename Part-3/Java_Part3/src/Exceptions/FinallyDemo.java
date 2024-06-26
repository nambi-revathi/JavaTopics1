package Exceptions;

import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		
		try 
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
		finally
		{
			System.out.println("finally block");
		}

	}

}
