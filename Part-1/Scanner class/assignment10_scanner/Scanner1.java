//Write a java program with multiple methods which performs Arithmatic oerations that returns the sum, difference,product,quotient,remainder?
//(Take input from User) 

import java.util.Scanner;
class Scanner1
{
  public static void sum()
  {
	Scanner sc=new Scanner(System.in);
	
	//System.out.println("-------------------Enter your Sum Values:-------------");
	System.out.println("Enter your num1 Value:");
    int num1= sc.nextInt();
	System.out.println("Enter your num2 Value:");
    int num2= sc.nextInt();
	}
	
	public static void sub()
	{
	//System.out.println("------------Enter your sub values:------------");
	System.out.println("Enter your num1 Value:");
    short num1= sc.nextShort();
	System.out.println("Enter your num2 Value:");
    short num2= sc.nextShort();
	}
	public static void main(String[] args)
	{
	System.out.println("sum:"+sum(num1+num2));
	System.out.println("sub:"+sub(num1-num2));
	}
}