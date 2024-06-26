class ParamMethod1 
{
	public static void add(int a,int b)  //formal parameters  //formal and actual should be same // Widening is possible but Narrowing is not possible or implicit is possible but explicit is not possible.
		{
		System.out.println(a+b);
	}

	public static void main(String[] args) 
	{
		add(10,20);                     //Actual parameters  //Data types of actual and formal should be same or dfferent no prob
	}
}
