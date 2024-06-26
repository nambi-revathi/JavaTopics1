package Filehandling;

public class UnBoxing {

	public static void main(String[] args)
	{
		Integer i=10;                        //non primitive data
		int i1=i.intValue();
		System.out.println(i1);          //10 primitive data
		
		Boolean b=false;                      //non primitive data
		boolean b1=b.booleanValue();
		System.out.println(b1);            //false primitive data
		
		Character c=97;                       //non primitive data
		char ch=c.charValue();
		System.out.println(ch);           //97 primitive data
		
		Double d=4.5;                   //non primitive data
		double d1=d.doubleValue();
		System.out.println(d1);           //4.5 primitive data
		
	}

}
