package Abstraction.Abstract;

public class Driver {

	public static void main(String[] args)
	{
		//Bike b=new Bike();     //can't create object
		
		Bike b=new Honda();    //Upcasting
		b.run();               //honda running
		
		Bike b1=new Pulsar();    //Upcasting
		b1.run();               //Pulsar running
		
	}

}
