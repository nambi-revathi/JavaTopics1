package Strings;

public class Example1 {

	public static void main(String[] args) {
		String s1=new String("QSP");
		String s2="QSP";
		System.out.println(s1==s2);                        //false
		System.out.println(s1.equals(s2));                 //true
		System.out.println(s1.hashCode()==s2.hashCode());     //true
		System.out.println(s1);                              //QSP
		System.out.println(s2);                               //QSP
	}

}
