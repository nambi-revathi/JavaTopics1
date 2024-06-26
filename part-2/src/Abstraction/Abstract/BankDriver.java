package Abstraction.Abstract;

public class BankDriver {

	public static void main(String[] args) 
	{
		//Bank is abstract class
		//Bank B=new Bank();     //can't create object
		
		Bank b=new SBI();     //upcasting 
		System.out.println(b.getRateOfInterest());   //8
		
		Bank b1=new RBI();     //upcasting 
		System.out.println(b1.getRateOfInterest());   //10	

	}

}
