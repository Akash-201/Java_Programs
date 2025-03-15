package NumberPrograms;
import java.util.Scanner;

public class Factorial
{
	public static void findFactorial(int n)
	{
		int multi=1;
		for(int i=1;i<=n;i++)
		{
			multi=multi*i;
		}
		
		System.out.println("Factorial of "+n+" is "+multi);
		}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter a Number: ");
			int n=sc.nextInt();
			findFactorial(n);
		}
		
	}

}
