package Filehandling;

public class Boxing {

	public static void main(String[] args) 
	{
		int i=10;                        //primitive data
		Integer i1=Integer.valueOf(i);
		System.out.println(i1);          //10 non-priitive data
		
		byte b=20;                        //primitive data
		Byte b1=Byte.valueOf(b);
		System.out.println(b1);            //20 non primitive data
		
		short s=56;                       //primitive data
		Short s1=Short.valueOf(s);
		System.out.println(s1);           //56 non primitive data
		
		boolean bo=false;                   // primitive data
		Boolean bo1=Boolean.valueOf(bo);
		System.out.println(bo1);           //false non primitive data
		
		
	}

}
