package encapsulation;

public class Employee 
{
	private int emp_id;        //r
	private String emp_name;   //r//w
	private double emp_salary;  //r
	
	Employee(int emp_id, String emp_name, double emp_salary)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_salary=emp_salary;
	}
	
	public int getEmpId()
	{
		return emp_id;
	}
	public String getEmpName()
	{
		return emp_name;
	}
	public String setEmpName(String emp_name)
	{
		return emp_name=emp_name;
	}
	public double getSalary()
	{
		return emp_salary;
	}
	
}
