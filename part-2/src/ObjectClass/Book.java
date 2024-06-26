package ObjectClass;                //toString()

public class Book 
{
	String bname="JAVA";
	int bid=123;
	double price=456.78;
	
	Book(String bname, int bid, double price)
	{
		this.bname=bname;
		this.bid=bid;
		this.price=price;
	}
	public String toString()
	{
		return "Bname is "+bname +" Bid is "+bid+ "Price is "+price;
	}
	public static void main(String[] args)
	{
		Book b=new Book("java",123,456.78);
		System.out.println(b);
	}
}
