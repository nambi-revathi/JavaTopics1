package has_A_relationship;                //Composition

public class Student {

	String sname;
	int sid;
	long cno;
	
	Student(String sname,int sid, long cno)
	{
		this.sname=sname;
		this.sid=sid;
		this.cno=cno;
	}
	
	public void display()
	{
		System.out.println("========Student Details========");
		System.out.println(sname);
		System.out.println(sid);
		System.out.println(cno);
	}
}
