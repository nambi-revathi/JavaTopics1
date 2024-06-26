package has_A_relationship.Aggregation;

public class Mobile1 
{
	String brand;
	String color;
	double price;
	Earphone e;

	Mobile1(String brand, String color, double price) 
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	public void insertEarphone(Earphone e)      //helper method
	{
		if(this.e==null)
		{
			this.e=e;
			System.out.println("Earphone inserted!!");
		}
		else
		{
			System.out.println("Earphone already inserted!!");
		}
	}
	
	public void removeEarphone()
	{
		if(e==null)
		{
			System.out.println("No earphone inserted to remove");
		}
		else
		{
			e=null;
			System.out.println("Earphone removed!!");
		}
	}
	
	public void earphoneDetails()
	{
		if(e==null)
		{
			System.out.println("No Earphone inserted!!");
			System.out.println("No details to display!!");
		}
		else
		{
		System.out.println("==========Earphone details============");
		System.out.println("Earphone brand "+e.brand);
		System.out.println("Earphone price "+e.price);
		System.out.println("Earphone color "+e.color);
	}
}
}