package Polymorphism;

public class ADriver
{
	public static void main(String[] args)
	{
		A a=new A();
		System.out.println(a.age);     //23
		
		B b=new B();
		System.out.println(b.age);      //34
		
		A a1=new B();
		System.out.println(a1.age);      //23   Compile time Polymorphism
		
	}

}
