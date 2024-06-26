package encapsulation;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp_id");
		int emp_id=sc.nextInt();
		System.out.println("Enter emp_name");
	     String emp_name=sc.next();
		System.out.println("Enter emp_salary");
		double emp_salary=sc.nextDouble();
		
		Employee e1=new Employee(emp_id, emp_name, emp_salary);
		System.out.println(e1.getEmpName());
		System.out.println("enter the name you want to modify");
		String new_name=sc.next();
		e1.setEmpName(new_name);
		System.out.println(e1.getEmpName());
		System.out.println(e1.getEmpId());
		System.out.println(e1.getSalary());
		
	}

}
