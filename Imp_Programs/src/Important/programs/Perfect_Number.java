package Important.programs;

//A Number that can be represented as the sum of it's factors except the number itself is known as the Perfect Number.

//Example
//Input : 6
//Output : Yes, It's a Prefect Number
//Explanation : Number = 6
//Factors of 6 except 6 are 1, 2 and 3. 
//When we add the three we get 6 itself. Therefore, it's a Perfect Number.

import java.util.Scanner;

public class Perfect_Number
{
	public static void print(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}

		}
		if(sum==n)
		{
			System.out.println(n+" is a perfect number");
		}
		else {
			System.out.println(n+" is not a perfect number");
		}
	}

	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number: ");
			int n=sc.nextInt();
			print(n);
		}

	}
}
