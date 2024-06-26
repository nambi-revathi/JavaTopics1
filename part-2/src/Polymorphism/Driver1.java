package Polymorphism;

public class Driver1 
{
	public static void main(String[] args) 
	{
		Parent1 p=new Parent1();
		p.m1();                    //from parent
		
		Child1 c=new Child1();
		c.m1();                     //from child
		
		Parent1 p1=new Child1();
		p1.m1();                    //from parent it is compile time polymorphism
	}

}
