package is_A_relationship;

public class Bike extends Vechicle
{
	Bike(int no_of_wheels, double price, int engine_no)
	{
		super(no_of_wheels, price,engine_no);
	}
	public void display()
	{
		System.out.println("======Bike Details===========");
		System.out.println(no_of_wheels);
		System.out.println(engine_no);
		System.out.println(price);
	}
}
