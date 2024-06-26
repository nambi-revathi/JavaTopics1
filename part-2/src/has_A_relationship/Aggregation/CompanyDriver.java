package has_A_relationship.Aggregation;

import java.util.Scanner;

public class CompanyDriver 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter company name");
	String company_name=sc.next();
	Company c=new Company(company_name);
	boolean exit=true;
	
	while(exit)
	{
		System.out.println("Enter your choice");
		System.out.println("1.AddEmployee\n 2.RemoveEmployee\n 3.UpdateEmpName\n 4.EmployeeDetails\n 5.Exit");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter employee name");
			String ename=sc.next();
			System.out.println("Enter employee id");
			int eid=sc.nextInt();
			System.out.println("Enter employee cno");
			long cno=sc.nextLong();
			c.addEmployee(new Employee(ename, eid, cno));
		}
		break;
		case 2:
		{
			c.removeEmployee();
		}
		break;
		case 3:
		{
			c.updateEmpName();
		}
		break;
		case 4:
		{
			c.empDetails();
		}
		break;
		case 5:
		{
			exit=false;
		}
		break;
		default:
		{
			System.out.println("Invalid choice!!");
		}
		}
	}
	}
}

