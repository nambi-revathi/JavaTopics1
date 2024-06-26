import java.util.Scanner;
class Switch1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1.Rice\n 2.Idli\n 3.Dosa");
		int choice=sc.nextInt();
		
		switch(choice)
		{		
			case 1:
			{
				System.out.println("Rice selected");
				System.out.println("Enter type of rice you want to order");
				System.out.println("1.Biryani\n 2.poha\n 3.chepathi");
				int choice=sc.nextInt();
				
				switch(choice1)
				{
					case 1:
					{
						System.out.println("biryani selected");
						System.out.println("Enter the no_of_plates");
						int no_of_plates=sc.nextInt();
						double total_bill=no_of_plates*80;
						System.out.println("The bill is "+total_bill);
					}
					break;
			
					case 2:
					{           
						System.out.println("poha selected");
						System.out.println("Enter the no_of_plates");
						int no_of_plates=sc.nextInt();
						double total_bill=no_of_plates*30;
						System.out.println("The bill is "+total_bill);
					}
					break;
					
					case 3:
					{           
						System.out.println("chepathi selected");
						System.out.println("Enter the no_of_plates");
						int no_of_plates=sc.nextInt();
						double total_bill=no_of_plates*50;
						System.out.println("The bill is "+total_bill);
					}
					break;
					
					default:
					System.out.println("Invalid choice");
			}
		}

	}
}