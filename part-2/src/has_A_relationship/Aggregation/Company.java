package has_A_relationship.Aggregation;

import java.util.Scanner;

public class Company 
{
	String company_name;
	Employee e;
	
	Company(String company_name)
	{
		this.company_name=company_name;
	}
	
	public void addEmployee(Employee e) 
	{
		if(this.e!=null)
		{
			System.out.println("Employee already present");
		}
		else 
		{
			this.e=e;
			System.out.println("Employee added Successfully!!");
		}
	}
	
	public void removeEmployee()
	{
		if(e!=null)
		{
			e=null;
			System.out.println("Employee removed");
		}
		else 
		{
			System.out.println("No employee to remove");
		}
	}
	
	public void updateEmpName()
	{
		if(e!=null)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter new name that you want to update");
			String new_name=sc.next();
			e.setName(new_name);
			System.out.println("Name updated sucessfully!!");
			System.out.println("Updated name is "+e.getEmpName());
		}
		else 
		{
			System.out.println("Employee not found");
		}
	}
	
	public void empDetails()
	{
		if(e!=null)
		{
			System.out.println("===========Employee details============");
			System.out.println("Employee name is "+e.getEmpName());
			System.out.println("Employee id is "+e.getEmpId());
			System.out.println("Employee cno is "+e.getCno());
		}
		else
		{
			System.out.println("Employee not Found!!");
		}	
	}

}
