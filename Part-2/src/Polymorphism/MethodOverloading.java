package Polymorphism;

public class MethodOverloading 
{
	public void display(String name)
	{
		System.out.println("Name is "+name);
	}
	public void display()
	{
		System.out.println("hello good morning!!");
	}
	public void display(int a, int b)
	{
		System.out.println("Parameters are");
		System.out.println(a);
		System.out.println(b);
	}
	public void display(int a, double d, String name)
	{
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+d);
		System.out.println("Name is "+name);
	}
	
	public static void main(String[] args) 
	{
		MethodOverloading o=new MethodOverloading();
		o.display();
		System.out.println("===================");
		o.display("Revathi");
		System.out.println("===================");
		o.display(12,30);
		System.out.println("===================");
		o.display(10,35,"seema");
	}

}
