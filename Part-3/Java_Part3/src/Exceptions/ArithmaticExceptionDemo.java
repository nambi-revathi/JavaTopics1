package Exceptions;

import java.util.Scanner;

public class ArithmaticExceptionDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a");
		int a=sc.nextInt();
		System.out.println("Enter b");
		int b=sc.nextInt();
		
		try
		{
			int c=a/b;                       //ArithmaticException
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
	
		System.out.println("good morning");
		System.out.println("hiii");
	
	}

}
