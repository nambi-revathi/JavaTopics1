package is_A_relationship;

import java.util.Scanner;

public class VechicleDriver 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("===========Car Details==========");
		System.out.println("Car engine no");
		int engine_no=sc.nextInt();
		
		System.out.println("Car no of wheels");
		int wheels=sc.nextInt();
		
		System.out.println("Car price");
		double price=sc.nextDouble();
		
		System.out.println("Car no of Doors");
		int doors=sc.nextInt();
		
		Car c=new Car(wheels,price,engine_no,doors);
		c.display();
		
		System.out.println("===========Bike Details==========");
		System.out.println("Bike engine no");
		int bengine=sc.nextInt();
		
		System.out.println("Bike no of wheels");
		int bwheels=sc.nextInt();
		
		System.out.println("Bike price");
		double bprice=sc.nextDouble();
		
		Bike b=new Bike(bwheels,bprice,bengine);
		b.display();
}
}
