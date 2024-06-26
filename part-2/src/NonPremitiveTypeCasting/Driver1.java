package NonPremitiveTypeCasting;             //(A,B,C,D program)

public class Driver1 {
	
	public static void main(String[] args)
	{
		A a=new D();    //upcasting
		B b=(B)a;
		C c=(C)a;
		D d=(D)a;        //Downcasting
		
		A a1=new B();      //upcasting
		B b1=(B)a1;        //Downcasting
		//C c1=(C)a1;       ClassCastException
		//D d1=(D)a1;       ClassCastException
		
		System.out.println(a instanceof A);      //true
		System.out.println(a instanceof B);      //true
		System.out.println(a instanceof C);      //true
		System.out.println(a instanceof D);      //true
		
		System.out.println(a1 instanceof A);      //true
		System.out.println(a1 instanceof B);      //true
		System.out.println(a1 instanceof C);      //false
		System.out.println(a1 instanceof D);      //false
		
	}

}
