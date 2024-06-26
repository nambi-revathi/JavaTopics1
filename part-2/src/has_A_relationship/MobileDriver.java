package has_A_relationship;                //Aggregation

import java.util.Scanner;

public class MobileDriver 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("=========Mobile Details==========");
		System.out.println("Enter mobile model");
		String model=sc.next();
		System.out.println("Enter mobile price");
		double price=sc.nextDouble();
		System.out.println("Enter mobile color");
		String color=sc.next();
		Mobile m=new Mobile(model,price,color);
		System.out.println("============Sim Details============");
		System.out.println("Enter sim no");
		int sim_no=sc.nextInt();
		System.out.println("Enter service_provider");
		String service_provider=sc.next();
		m.insertSim(new Sim(sim_no,service_provider));
		m.display();
		m.s.simDetails();
		m.removeSim();
		//System.out.println(m.s.service_provider);   //NullPointerException
	}

}
