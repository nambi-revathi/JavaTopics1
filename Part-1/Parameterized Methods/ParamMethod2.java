class ParamMethod2 
{
	public static void add(float a, int b) //different data type
		{
		System.out.println(a+b);
	}

	public static void sub(int a, int b) //different data type   //(char a, int b)is not possible because narrowing is not acceptable cause char is smaller than int.
		{
		System.out.println(a-b);
	}

	public static void main(String[] args) 
	{
		add(12,23);  //method call statement
		add(45,67);
		add(56,4);
		add(5,6);       // Different and more u can give values

		sub(8,10);
	}

}
