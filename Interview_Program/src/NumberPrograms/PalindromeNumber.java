package NumberPrograms;

//A palindrome number is a number that reads the same forward and backward, such as 121 or 1331.

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void checkPalindrome(int n)
	{
		int temp=n;
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			 rev=rev*10+rem;
			 n=n/10;
		}
		if(temp==rev)
		{
			System.out.println(temp+" is a palindrome number.");
		}
		else
		{
			System.out.println(temp+" is not a palindrome number.");
		}
	}
	public static void main(String[] arge)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter a number: ");
			int n=sc.nextInt();
			checkPalindrome(n);
		}
	}

}
