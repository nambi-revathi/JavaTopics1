package is_A_relationship;

public class DoctorDriver 
{
	public static void main(String[] args)
	{
		Doctor d=new Doctor();  //parent class
		System.out.println(d.name);  //Navya
		System.out.println(d.dlno);
		d.checkBP();
		d.checkPulse();
		//d.bypass();cannot access child member with the help of parent reference.
		
		Cardialogist c=new Cardialogist();   //child class
		System.out.println(c.name);          //Revathi
		System.out.println(c.dlno);
		c.checkBP();
		c.checkPulse();     //child member can be accessed with parent reference
		c.bypass();
	}

}
