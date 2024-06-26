package Abstraction.Interface;

public class DemoDriver {
	
	public static void main(String[] args)
	{
		//Demo d=new Demo();    //can't create object,Interface
		
		Demo d=new Child();   //upcasting
		d.m1();
		d.m2();              //child methods
		//d.m3();
		Demo.m3();          //static method
	}

}
