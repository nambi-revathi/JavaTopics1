class MethodArea6
{
	public static int areaOfSquare()
	{
	 int a=56;
	 int area=a*a;
	 return area;
	}
	public static double areaOfRectangle()
	{
		int l=7;
		double w=978789;
		double area=l*w;
		return area;
	}
	public static float areaOfCircle()
	{
	 int r=6;
	 float area=3.142f*r*r;
	 return area;
	}
	public static void main(String[] args)
	{
		System.out.println(areaOfSquare());
		System.out.println(areaOfRectangle());
		System.out.println(areaOfCircle());
	}
}