package encapsulation;

public class StudentDriver {
	public static void main(String[] args)
	{
		Student s1=new Student();
		System.out.println(s1.getName()); //Revathi
		System.out.println(s1.getMarks());//99
		s1.setName("Seema");
		System.out.println(s1.getName());//seema
		s1.setAge(34);
		System.out.println(s1.getSid());//45
		s1.setSid(78);
		System.out.println(s1.getSid());//78
	}
}
