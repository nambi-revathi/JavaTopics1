package Strings;

public class StringBufferDemo1 {

	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("java");
		System.out.println(sb);         //Hellojava
		sb.insert(1, "Python");
		System.out.println(sb);         //Hpythonllojava
		sb.replace(1, 3, "hiii");
		System.out.println(sb);
		sb.delete(1, 3);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
