import java.util.Scanner;
class Switch2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int dice=sc.nextInt();
			
			switch(dice)
			{
				case 1:
					System.out.println("sing");
					break;
				case 2:
					System.out.println("dance");
					break;
				case 3:
					System.out.println("slap");
					break;
				case 4:
					System.out.println("sleep");
					break;
				case 5:
					System.out.println("jump");
					break;
				case 6:
					System.out.println("run");
					break;
				default:
					System.out.println("Invalid");
					
			}
	
	}

}