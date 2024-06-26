package Strings;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String you want to Reverse");
		String str=sc.next();
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reversed String is "+reverse);
		
		if(str.equals(reverse))
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not Palindrome");
		}
		
	}

}
