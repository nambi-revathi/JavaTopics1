package Polymorphism;

public class Driver 
{
	public static void main(String[] args)
	{
		Parent p=new Parent();
		p.m1();                   //from parent
		
		Child c=new Child();
		c.m1();                   //from child
		
		Parent p1=new Child();       //upcasting
		p1.m1();                     //from child because runtime polymorphism
	}

}
