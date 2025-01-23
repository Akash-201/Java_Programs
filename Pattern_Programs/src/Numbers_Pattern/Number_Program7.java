package Numbers_Pattern;

//1 2 3
//6 5 4
//7 8 9
//12 11 10
//13 14 15 


//here we take r=any number, but c=always 3
// if we change r=any number then we change k+ that number in else part in for loop

import java.util.Scanner;

public class Number_Program7
{
	public static void print(int r,int c)
	{
		int k=0;
		for(int i=1;i<=r;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=c;j++)
				{
					k=k+1;
					System.out.print(k+" ");
					
				}
			}
			else
			{
				int temp=k+1;
				for(int j=k+3;j>=temp;j--)
				{
					System.out.print(j+" ");
					k++;
				}
			}
			
			System.out.println();
		}
		
	}
	public static void main(String[] args)
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of r: ");	
			int r=sc.nextInt();
			System.out.println("Enter the value of c: ");	
			int c=sc.nextInt();
			print(r,c);
		}

	}

}
