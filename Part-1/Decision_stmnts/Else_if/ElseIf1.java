import java.util.Scanner;
class ElseIf1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		
		if(number>0){
			System.out.println("Positive number");
		}
		else if(number==0){
			System.out.println("Number is Zero");
		}
		else if(number<0){
			System.out.println("Negative number");
		}
		else{
			System.out.println("Invalid number");
		}
	}

}