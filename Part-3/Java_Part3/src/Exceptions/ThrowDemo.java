package Exceptions;

import java.util.Scanner;

public class ThrowDemo
{
	public static void validate(int age) throws AgeNotFoundException
	{
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else 
		{
			throw new AgeNotFoundException();
		}
	}
	

	public static void main(String[] args)  //caller
	{
		System.out.println("main starts");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age");
		int age=sc.nextInt();
		try
		{
			validate(age);
		}
		catch(AgeNotFoundException e)
		{
			System.out.println("Exception handled by caller");
		}
		System.out.println("main ends");
	  }
	}


