import java.util.Scanner;
class IfElse1
{
	public static void validate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("-------------");
		System.out.println("Enter number");
		int age=sc.nextInt();
		
		if(age>=18){
			System.out.println("Eligible for vote");
		}
		else{
		System.out.println("Not Eligible for vote");
	}
}
	
	public static void main(String[] args)
	{
		validate();
		validate();
		validate();	
	}

}