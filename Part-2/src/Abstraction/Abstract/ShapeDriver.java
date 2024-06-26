package Abstraction.Abstract;

public class ShapeDriver 
{
	public static void main(String[] args)
	{
		//Shape s=new Shape();    //can't create object
		
		Shape s=new Rectangle();   //upcasting
		s.draw();
		s.erase();
		s.paint();                 //Rectangle methods
		
		System.out.println("==============");
		Shape s1=new Square();      //upcasting
		s1.draw();
		s1.erase();
		s1.paint();               //Square methods
	}

}
