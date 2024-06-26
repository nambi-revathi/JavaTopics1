package has_A_relationship;                   //Aggregation

public class Mobile {
	String model;
	double price;
	String color;
	Sim s;
	
	Mobile(String model, double price, String color) 
	{
		this.model=model;
		this.price=price;
		this.color=color;
	}
	public void insertSim(Sim s)               //helper method
	{
		this.s=s;
	}
	public void display()
	{
		System.out.println("===========Mobile Details===================");
		System.out.println("model "+model);
		System.out.println("price "+price);
		System.out.println("color "+color);					
	}
	public void removeSim()
	{
		this.s=null;
		System.out.println("sim removed");
	}

}
