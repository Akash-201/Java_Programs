package Important.programs;

import java.util.Scanner;

public class Pronic_Number_1_to_100
{
	public static boolean check(int n)
	{
		boolean flag=false;
		for(int i=1;i<=n;i++)
		{
			if(i*(i+1)==n)
			{
				flag=true;
				break;
			}
		}
		return flag;

	}

	public static void print(int s,int e)
	{
		for(int i=s;i<=e;i++)
		{
			if(check(i))
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}public static void main(String[] args) 
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter starting number: ");
			int s=sc.nextInt();
			System.out.println("Enter ending number: ");
			int e=sc.nextInt();
			print(s,e);
		}

	}


}
