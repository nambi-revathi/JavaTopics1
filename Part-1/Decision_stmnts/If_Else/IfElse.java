import java.util.Scanner;
class IfElse
{
	public static void evenodd(int number)
	{
		if(number%2==0){
			System.out.println(number+" Even number");
		}
		else{
			System.out.println(number+" Odd number");
		}		
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		evenodd(n);
		
		System.out.println("Enter number");
		int k=sc.nextInt();
		evenodd(k);		
	}

}