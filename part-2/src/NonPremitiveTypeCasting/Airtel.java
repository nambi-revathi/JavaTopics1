package NonPremitiveTypeCasting;

public class Airtel extends Sim
{
	String color;
	Airtel(int sim_no, String network_type, String service_provider,String color)
	{
		super(sim_no, network_type, service_provider);
		this.color=color;
	}
	
	public void display()
	{
		System.out.println("==========Airtel Details============");
		System.out.println("Sim no "+sim_no);
		System.out.println("Service provider "+service_provider);
		System.out.println("Network type "+network_type);
		System.out.println("Color "+color);
	}
}
