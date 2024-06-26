package encapsulation;

public class Student {
	private String name="Revathi"; //r//w
	private int marks=99;        //r
	private int age=25;          //w
	private int sid=45;          //r//w
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getMarks()
	{
		return marks;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getSid()
	{
		return sid;
	}
	public void setSid(int sid)
	{
		this.sid=sid;
	}
}
