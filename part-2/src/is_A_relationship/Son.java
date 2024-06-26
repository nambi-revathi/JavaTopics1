package is_A_relationship;

public class Son extends Father
{
	String name="navya";
	int age=7;
	
	public void sonData()
	{
		System.out.println("Father's name "+super.name);
		System.out.println("Son's name "+this.name);
		System.out.println("Father's age "+super.age);
		System.out.println("Son's age "+this.age);
	}

}
