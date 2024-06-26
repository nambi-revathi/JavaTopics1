package has_A_relationship;                   //Composition

public class College {

	String cname;
	int id;
	String address;
	Student s;
	//Student s=new Student("Karthik",123,345678);
	
	College(String cname, int id, String address, Student s)
	{
		this.cname=cname;
		this.id=id;
		this.address=address;
		this.s=s;
	}
	
	public void display() {
		// TODO Auto-generated constructor stub
		System.out.println("==========College Details============");
		System.out.println(cname);
		System.out.println(id);
		System.out.println(address);
		System.out.println(s.sname);
		System.out.println(s.sid);
		System.out.println(s.cno);
	}

}
