package NonPremitiveTypeCasting;

import java.util.Scanner;

public class CabDriver 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==========================");
		System.out.println("Press 1 for Mini");
		System.out.println("Press 2 for Micro");
		System.out.println("Press 3 for Sadan");
		
		int choice=sc.nextInt();
		Cab c;
		
		switch(choice)
		{
		case 1:
		{
			c=new Mini();     //upcasting
			Mini m=(Mini)c;   //downcasting
			System.out.println("Mini selected!!");
			m.display();
		}
		break;
		case 2:
		{
			c=new Micro();     //upcasting
			Micro m1=(Micro)c;   //downcasting
			System.out.println("Micro selected!!");
			m1.display();	
		}
		break;
		case 3:
		{
			c=new Sadan();     //upcasting
			Sadan s=(Sadan)c;   //downcasting
			System.out.println("Sadan selected!!");
			s.display();
		}
		break;
		default:
		{
			System.out.println("Invalid choice");
		}
		}
	}
	
}
