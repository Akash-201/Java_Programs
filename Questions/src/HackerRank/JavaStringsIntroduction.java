package HackerRank;

import java.util.Scanner;

public class JavaStringsIntroduction 
{
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A: ");		String A=sc.next();
		System.out.print("Enter B: ");
		String B=sc.next();

		System.out.println(A.length()+B.length());
		if(A.charAt(0) > B.charAt(0))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");  
		}

		String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
		String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);

		System.out.println(capitalizedA + " " + capitalizedB);

	}


}
