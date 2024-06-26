package is_A_relationship;

public class Car extends Vechicle
{
	int no_of_doors;
	
	Car(int no_of_wheels, double price, int engine_no, int no_of_doors)
	{
		super(no_of_wheels, price, engine_no);
		this.no_of_doors=no_of_doors;
	}
	
	public void display()
	{
		System.out.println("============Car Details==============");
		System.out.println(no_of_doors);
		System.out.println(no_of_wheels);
		System.out.println(engine_no);
		System.out.println(price);
	}
}
