class ParamMethod3 
{
	public static void display(String name, char gender, int age, long cno, double salary)
		{
		System.out.println("The name is"+name);
		System.out.println("The gender is"+gender);
		System.out.println("The age is"+age);
		System.out.println("The cno is"+cno);
		System.out.println("The salary is"+salary);
	}

	public static void main(String[] args) 
	{
		display("Revathi",'f',34,4578856,23.4566);
		display("Navya",'f', 17, 89065, 56.89);
		display("Vamsi",'m', 27, 23455, 67.89);
	}
}
