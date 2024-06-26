import java.util.Scanner;
class ElseIf2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks");
		int Marks=sc.nextInt();
		if(Marks>=0 && Marks<50)
			System.out.println("Failed!! Good luck next time");
		else if(Marks>=50 && Marks<60)
			System.out.println("E Grade");
		else if(Marks>=60 && Marks<70)
			System.out.println("D Grade");
		else if(Marks>=70 && Marks<80)
			System.out.println("C Grade");
		else if(Marks>=80 && Marks<90)
			System.out.println("B Grade");
		else if(Marks>=90 && Marks<100)
			System.out.println("A Grade");
		else if(Marks==100)
			System.out.println("OutStanding");
		else
			System.out.println("Invalid Marks");
	}
}
