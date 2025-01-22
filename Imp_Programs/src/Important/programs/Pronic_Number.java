package Important.programs;

//WAJP to check if a number is a pronic number.
//•	Example: 42 = 6 * 7

import java.util.Scanner;

public class Pronic_Number 
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
