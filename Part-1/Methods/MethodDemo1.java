class  MethodDemo1
{
	public static void m1()
		{
		System.out.println("Good morning");
		m2();
		System.out.println("Hellooo");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		m1();
		System.out.println("Main ends");
	}

	public static void m2(){
		System.out.println("Hiii");
	}
}
