package InterviewerAsked;

import java.util.Scanner;
public class ReverseString
{
	public static void reverseString(String str)
	{
		char[] ch=str.toCharArray();
		String convert="";
		for(int i=ch.length-1;i>=0;i--)
		{
			convert+=ch[i];
			
		}
		System.err.println(convert);
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.print("Enter a String: ");
		String str=sc.nextLine();
		reverseString(str);
		}
	}
	

}
