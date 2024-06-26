class MethodDemo5
{
	public static int add(int a,int b)//Called  (Instead of void here we are using any data type(int))
	{
		int sum=a+b;
		return sum;
	}
	public static double sub()
	{
		int a=12;
		float b=45.6f;
		double difference=a-b;
		return difference;
	}
	
	public static void main(String[] args)
	{
		int result=add(2,3); //caller
		
		System.out.println("The sum of two numbers is "+result);
		System.out.println("The Sum of Two numbers is "+add(2,3));
		System.out.println("The difference of two numbers is "+sub());
		System.out.println(sub());
		System.out.println(sub());
	}
}           