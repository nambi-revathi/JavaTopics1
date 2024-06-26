package Abstraction.Interface;

public class TestInterface {

	public static void main(String[] args) 
	{
		//Test t=new Test();
		
		Test t=new Circle();     //upcasting
		t.draw();
		
		Test t1=new Triangle();   //upcasting
		t1.draw();
		

	}

}
