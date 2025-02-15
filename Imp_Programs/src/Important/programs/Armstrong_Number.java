package Important.programs;

//An Armstrong number is a number that equals the sum of its digits raised to the power of the number of digits.
//For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153


import java.util.Scanner;

public class Armstrong_Number
{
	
	public static String check(int n)
	{
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			rem=rem*rem*rem;
			sum+=rem;
			n/=10;
			
		}
		if(temp==sum)
		{
			return "Yes";
		}
		else
		{
			return "No";
		}
		
	}
	
	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		System.out.println(check(n)); 
		}
		
	}
}
