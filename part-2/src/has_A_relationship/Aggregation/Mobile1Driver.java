package has_A_relationship.Aggregation;

import java.util.Scanner;

public class Mobile1Driver 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("==========Mobile Details=============");
		System.out.println("Enter mobile brand");
		String brand=sc.next();
		System.out.println("Enter mobile price");
		double price=sc.nextDouble();
		System.out.println("Enter mobile color");
		String color=sc.next();
		
		Mobile1 m=new Mobile1(brand,color,price);
		boolean exit=true;
		
		while(exit) 
		{
			System.out.println("Enter your choice");
			System.out.println("1.Insert Earphone\n 2.Remove Earphone\n 3.Earphone Details\n 4.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter earphone brand");
				String ebrand=sc.next();
				System.out.println("Enter earphone price");
				double  eprice=sc.nextDouble();
				System.out.println("Enter Earphone color");
				String ecolor=sc.next();
				m.insertEarphone(new Earphone(ebrand,ecolor,eprice));
			}
			break;
			case 2:
			{
				m.removeEarphone();
			}
			break;
			case 3:
			{
				m.earphoneDetails();
			}
			break;
			case 4:
			{
				exit=false;
			}
			break;
			default:
			{
				System.out.println("Invalid choice");
			}
			}
		}
	}

}
