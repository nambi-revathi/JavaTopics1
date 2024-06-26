package has_A_relationship;                  //Composition

public class Car 
{
	String model;
	String color;
	double price;
	Engine e;     //Engine e=new Engine(123,67);//with help of initializer
	
	Car(String model,String color,double price,Engine e)    //Constructor 
	{
		// TODO Auto-generated constructor stub
		this.model=model;
		this.color=color;
		this.price=price;
		this.e=e;
	}
	public void carDetails()
	{
		System.out.println("=======Car Details===========");
		System.out.println(model);
		System.out.println(color);
		System.out.println(price);
		System.out.println(e.getEngineNo());
		System.out.println(e.getCC());
	}
}
