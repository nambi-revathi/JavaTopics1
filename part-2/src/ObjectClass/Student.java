package ObjectClass;                   //equals()

public class Student 
{
	int id;
	String sname;
	
	Student(int id, String sname)
	{
		this.id=id;
		this.sname=sname;
	}
	
	public boolean equals(Object o)
	{
		Student s=(Student)o;
		return this.id==s.id && this.sname.equals(s.sname);
	}
	
	public static void main(String[] args) 
	{
		Student s1=new Student(12,"Navya");
		Student s2=new Student(12,"Navya");
		Student s3=new Student(12,"Seema");
		
		System.out.println(s2.equals(s3));   //false
		System.out.println(s1.equals(s2));  //true
		System.out.println(s1==s2);         //false
		}

}
