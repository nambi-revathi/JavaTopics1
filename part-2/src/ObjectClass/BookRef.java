package ObjectClass;

public class BookRef         //if you want to print reference of the you can use it.
                              //without toString() method.
{
	String bname;
	int bid;
	double price;
	
	public static void main(String[] args)
	{
		Book b=new Book();
		System.out.println(b);
	}
}
