package has_A_relationship;                  //Aggregation

public class Sim {
	private int sim_no; //r
	String service_provider;
	
	Sim(int sim_no, String service_provider)
	{
		this.sim_no=sim_no;
		this.service_provider=service_provider;
	}
	public int getSimNo()
	{
		return sim_no;
	}
	public void simDetails()
	{
		System.out.println("============Sim Details=============");
		System.out.println(sim_no);
		System.out.println(service_provider);
	}
}
