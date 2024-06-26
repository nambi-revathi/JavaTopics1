package has_A_relationship;                //Composition

import java.util.Scanner;

public class CollegeDriver
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("=============College Details===============");
		System.out.println("Enter college name");
		String cname=sc.next();
		System.out.println("Enter college id");
		int cid=sc.nextInt();
		System.out.println("Enter college address");
		String address=sc.next();
		System.out.println("==============Student details===============");
		System.out.println("Enter Student name");
		String name=sc.next();
		System.out.println("Enter Student id");
		int sid=sc.nextInt();
		System.out.println("Enter Student cno");
		long cno=sc.nextLong();
		
		College c=new College(cname,cid,address,new Student(name,sid,cno));
		System.out.println(c.s.sname);
		System.out.println(c.s.sid);
		c.s.display();
		c.display();
		System.out.println(c.cname);
		System.out.println(c.id);
	}

}
