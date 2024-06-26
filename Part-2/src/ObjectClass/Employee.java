package ObjectClass;                       //hashcode()

import java.util.Objects;

public class Employee 
{
	int id;
	String ename;
	
	Employee(int id, String ename)
	{
		this.id=id;
		this.ename=ename;
	}
	
	public int hashCode()
	{
		return Objects.hash(id,ename);
	}

	public static void main(String[] args) 
	{
		Employee e1=new Employee(12,"Shruthi");
		Employee e2=new Employee(12,"Shruthi");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}
