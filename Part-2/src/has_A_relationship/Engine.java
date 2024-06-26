package has_A_relationship;    //Composition

public class Engine
{
	private int engine_no;  //r
	private int cc;          //r
	
	Engine(int engine_no,int cc)
	{
		this.engine_no=engine_no;
		this.cc=cc;
	}
	
	public int getEngineNo()
	{
		return engine_no;
	}
	public int getCC()
	{
		return cc;
	}
	
	public void engineDetails()
	{
		System.out.println("=======Engine Details=========");
		System.out.println(engine_no);
		System.out.println(cc);
	}

}
