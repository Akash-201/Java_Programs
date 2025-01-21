package Important.programs;

import java.util.Scanner;

public class Prime_Factor
{
	public static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				int count=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.println(i);
				}
			}
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
