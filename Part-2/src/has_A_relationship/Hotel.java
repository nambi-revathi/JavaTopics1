package has_A_relationship;                  //Aggregation

public class Hotel {
	
	String hname;
	String address;
	Swiggy s;
	
	public Hotel(String hname, String address) 
	{
		this.hname=hname;
		this.address=address;
	}
	
	public void connection(Swiggy s)  //helper method
	{
		this.s=s;
	}
}
