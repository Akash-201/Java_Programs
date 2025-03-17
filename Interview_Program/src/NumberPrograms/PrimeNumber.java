package NumberPrograms;
import java.util.Scanner;

public class PrimeNumber
{
	public static void checkPrime(int n)
	{
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter any number: ");
			int n=sc.nextInt();
			checkPrime(n);
		}
		
	}

}
