package NonPremitiveTypeCasting;

public class Driver {

	public static void main(String[] args) 
	{
		Parent p=new Parent();
		System.out.println(p.name);
		System.out.println(p.age);
		p.m1();
		
		Child c=new Child();
		System.out.println(c.name);
		System.out.println(c.address);
		System.out.println(c.age);
		c.m1();
		c.m2();
		
		Parent p1=new Child();     //upcasting
		System.out.println(p1.age);
		System.out.println(p1.name);
		p1.m1();
		//p1.m2();
		//System.out.println(p1.address);  //once upcasted, can't access child members with help of p1.
	}

}
