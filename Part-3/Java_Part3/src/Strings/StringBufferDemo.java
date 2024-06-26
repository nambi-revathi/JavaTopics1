package Strings;

public class StringBufferDemo {

	public static void main(String[] args)
	{
		StringBuffer s1=new StringBuffer("Hello");
		StringBuffer s2=new StringBuffer("Hello");
		StringBuffer s3=new StringBuffer("Hiiiii");
		System.out.println(s1==s2);                    //false
		System.out.println(s1.equals(s3));             //false
		System.out.println(s1);                       //hello
		System.out.println(s2);                       //hello
		System.out.println(s3);                       //hiiiii
		System.out.println(s1.hashCode()==s2.hashCode());    //false
		System.out.println(s2.hashCode()==s3.hashCode());   //false
				

	}

}
