package NonPremitiveTypeCasting;

import java.util.Scanner;

public class SimDriver {
	
	public static void main(String[] args)
	{
		Sim s=null;               //generalised container
		Scanner sc=new Scanner(System.in);
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter your choice");
			System.out.println("1.Chooose Sim\n 2.SimDetails\n 3.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("select sim");
				System.out.println("1.Airtel\n 2.Idea");
				int choice1=sc.nextInt();
				switch(choice1)
				{
				case 1:
				{
					s=new Airtel(3456,"Airtel","4G","red");
					System.out.println("Airtel sim choosen");
				}
				break;
				case 2:
				{
					s=new Idea(7899,"Idea","5G","Yellow");
					System.out.println("Idea sim choosen");
				}
				break;
				}		
			}
			break;
			case 2:
			{
				if(s==null)
				{
					System.out.println("Sim not choosen");
				}
				else if(s instanceof Airtel)
				{
					Airtel a=(Airtel)s;
					a.display();
				}
				else if(s instanceof Idea)
				{
					Idea i=(Idea)s;
					i.display();
				}
			}
			break;
			case 3:
			{
				exit=false;
			}
			break;
			default:
			{
				System.out.println("Invalid option");
			}
	      }
		}
     }
}