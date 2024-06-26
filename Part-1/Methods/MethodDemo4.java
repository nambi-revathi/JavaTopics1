class MethodDemo4
{
	public static void display(String name, char gender,int age, long cno, double salary)
	{
	System.out.println("-----Details-----");
	System.out.println("The name is "+name);
	System.out.println("The gender is "+gender);
	System.out.println("The age is "+age);
	System.out.println("The cno is "+cno);
	System.out.println("The salary is "+salary);
	}
	public static void main(String[] args)
	{
		display("Revathi",'f',25,567789,45000);
		display("Shruthi",'f',26,67899,50000);
	}
}