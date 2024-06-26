package Strings;

public class Example2 {

	public static void main(String[] args) 
	{
		String s1="Hello";
		String s2="hii";
		String s3=s2;
		s1=s3;
		System.out.println(s1=="hiiii");                           //true
		System.out.println(s1.hashCode()==s2.hashCode());          //true
		System.out.println(s1.equals(s3));                       //true
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
