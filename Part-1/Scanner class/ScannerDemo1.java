//Scanner class
import java.util.Scanner;

class ScannerDemo1  
{
	public static void add()
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Age:");
		byte age=sc.nextByte();
		System.out.println("Enter num:");
		int num=sc.nextInt();
		System.out.println("Enter Mno:");
		long Mno=sc.nextLong();
		System.out.println("Enter Acc_no:");
		double Acc_no=sc.nextDouble();
		System.out.println("Enter Float_num:");
		float Float_num=sc.nextFloat();
		System.out.println("Enter your Marital_status true/false:");
		boolean Marital_status=sc.nextBoolean();
		System.out.println("Enter your Gender:");
		char Gender=sc.next().charAt(0);
		System.out.println("Enter your Name:");
		String Name=sc.next();
	}
		
	public static void main(String[] args) 
	{
		add();
		
	}
}
