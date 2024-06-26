package ObjectClass;                       //toString(),equals(),hashCode()

import java.util.Objects;

public class Bus 
{
	int bus_no;
	String dest;
	
	Bus(int bus_no, String dest)
	{
		this.bus_no=bus_no;
		this.dest=dest;
	}
	
	public String toString()
	{
		return "Bus no "+bus_no +" Destination "+dest;
	}
	
	public boolean equals(Object o)
	{
		Bus b=(Bus)o;
		return this.bus_no==b.bus_no && this.dest.equals(b.dest);
	}
	
	public int hashCode()
	{
		return Objects.hash(bus_no,dest);
	}
	
	public static void main(String[] args) 
	{
		Bus b1=new Bus(1234,"Bangalore");
		Bus b2=new Bus(1234,"Delhi");
		Bus b3=new Bus(1234,"Bangalore");
		
		System.out.println(b1.equals(b3));     //true
		System.out.println(b1.equals(b2));     //false	
		System.out.println(b1==b3);            //false comparing reference
		System.out.println(b1);
		System.out.println(b1.hashCode()==b3.hashCode());                  //true
		System.out.println(b2.hashCode()==b3.hashCode());     //false
		

	}

}
