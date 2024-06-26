package Abstraction.Interface;

public class InterfaceDriver {

	public static void main(String[] args) 
	{
		//I1 i1=new I1();
		//I2 i2=new I2();
		
		I1 i1=new SubClass();
		i1.m1();     //m1() of interface1 body is given
		
		I2 i2=new SubClass();
		i2.m1();     //m1() of interface2 body is given
	

	}

}
