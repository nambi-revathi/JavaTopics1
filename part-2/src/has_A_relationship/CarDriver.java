package has_A_relationship;                    //Composition

public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car("alto","red",567.98,new Engine(123,67));
		c.carDetails();
		c.e.engineDetails();
		System.out.println(c.e.getCC());              //Early Instantation
		System.out.println(c.e.getEngineNo());
	}

}
