package Strings;

public class StringDemo {

	public static void main(String[] args) 
	{
		String s=" Revathi ";
		System.out.println(s);        //Revathi
		String s1=s.trim();         //Revathi
		System.out.println(s1.length());       //7
		System.out.println(s.length());        //9
		System.out.println(s1.startsWith("Re"));      //true
		System.out.println(s1.endsWith("hi"));        //true
		System.out.println(s1.charAt(5));             //t
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		String s2="Java is a Programming language";
		String s3=s2.replace("java","python");
		System.out.println(s3);
		System.out.println(s.concat(s2));
		System.out.println(s1.indexOf('a'));
		
	}

}
