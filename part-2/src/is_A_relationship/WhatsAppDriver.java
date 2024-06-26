package is_A_relationship;

public class WhatsAppDriver 
{
	public static void main(String[] args)
	{
		WhatsAppV1 v1=new WhatsAppV1();
		v1.send();
		//v1.audio();
		//v1.vedio();
		//v1.payment();
		System.out.println("=============");
		
		WhatsAppV2 v2=new WhatsAppV2();
		v2.send();
		v2.audio();
		//v2.vedio();
		//v2.payment();
		System.out.println("=============");
		
		WhatsAppV3 v3=new WhatsAppV3();
		v3.send();
		v3.audio();
		v3.vedio();
		//v3.payment();
		System.out.println("=============");
		
		WhatsAppV4 v4=new WhatsAppV4();
		v4.send();
		v4.audio();
		v4.vedio();
		v4.payment();
		System.out.println("=============");
	}

}
